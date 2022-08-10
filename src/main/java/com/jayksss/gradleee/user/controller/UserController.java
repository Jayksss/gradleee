package com.jayksss.gradleee.user.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.jayksss.gradleee.user.model.User;
import com.jayksss.gradleee.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	UserService userService;
	
	/**
	 * 유저 목록 조회
	 * @param model
	 * @return List
	 */
	@PostMapping("/userList")
	public List<User> userList(Model model) {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		List<User> list = userService.userList();
		logger.info("list >>> {}", list);
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return list;
	}
	
	/**
	 * 회원가입 신청
	 * @param model
	 * @return void
	 */
	@PostMapping("/signup")
	public void signup(Model model, @RequestParam Map<String, Object> param) {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		System.out.println("param >>> " + param);
		userService.signup(param);
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
	}
}