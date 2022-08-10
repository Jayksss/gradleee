package com.jayksss.gradleee.user.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jayksss.gradleee.user.mapper.UserMapper;
import com.jayksss.gradleee.user.model.User;

@Service
public class UserService {
	
	@Autowired
	public UserMapper userMapper;
	
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	/**
	 * 유저 목록 조회
	 */
	public List<User> userList() {
		return userMapper.selectUser();
	}
	
	/**
	 * 회원가입 신청
	 */
	public void signup(Map<String, Object> param) {
		
		//비밀번호 암호화
		param.put("password", passwordEncoder.encode((String) param.get("password")));
		userMapper.inserUser(param);
	}
}