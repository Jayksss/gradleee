package com.jayksss.gradleee.main.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.google.gson.Gson;
import com.jayksss.gradleee.main.service.MainService;

@Controller
@RequestMapping("/")
public class MainController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	MainService mainService;
	
	/**
	 * Welcome 페이지
	 * @return String
	 */
	@GetMapping("/welcome")
	public String welcome() {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/welcome";
	}
	
	/**
	 * 메인 페이지
	 * @param model
	 * @return String
	 */
	@GetMapping("/main")
	public String Main(Model model) {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		List<Map<String, Object>> actorList = mainService.getActor();
		model.addAttribute("actorList", actorList);
		
		//gson 적용 : view에 json 형태로 전달
		Gson gson = new Gson();
		String list = gson.toJson(actorList);
		model.addAttribute("list", list);
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/main";
	}
	
	/**
	 * 기본 템플릿 페이지
	 * @return String
	 */
	@GetMapping("/defaultTemplete")
	public String defaultTemplete() {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/default_templete";
	}
	
	/**
	 * 게시판 페이지
	 * @return String
	 */
	@GetMapping("/bbs")
	public String bbs() {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/bbs";
	}
	
	/**
	 * 회원가입 페이지
	 * @return String
	 */
	@GetMapping("/signup")
	public String signup() {
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: Start ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		logger.info("■□■□■□■□■□■□■□ MethodName ::: {} ::: End ■□■□■□■□■□■□■□", Thread.currentThread().getStackTrace()[1].getMethodName());
		
		return "content/signup";
	}
}