package com.jayksss.gradleee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	// 시큐리티 예외처리할 경로들
	private static final String[] AUTH_WHITELIST = {
		"/css/**",
		"/fonts/**",
		"/js/**",
		"/images/**",
		"/**/**",
	};

	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public void configure(WebSecurity web) {
		web.ignoring().antMatchers(AUTH_WHITELIST);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
			.authorizeRequests()
			.antMatchers("/", "/main", "/login", "/signup").permitAll() // 누구나 접근 허용
			.antMatchers("/admin").hasRole("ADMIN") // ADMIN만 접근 가능
			.anyRequest().authenticated() // 나머지 요청들은 권한의 종류에 상관 없이 권한이 있어야 접근 가능
			.and()
			.formLogin()
			.loginPage("/login") // 로그인 페이지 링크
			.defaultSuccessUrl("/main") // 로그인 성공 후 리다이렉트 주소
			.and()
			.logout()
			.logoutSuccessUrl("/main") // 로그아웃 성공시 리다이렉트 주소
			.invalidateHttpSession(true) // 세션 날리기
		;
	}
}