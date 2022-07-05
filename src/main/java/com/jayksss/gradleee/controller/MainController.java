package com.jayksss.gradleee.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MainController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	/**
	 * 메인
	 * @param request
	 * @param model
	 */
	@GetMapping("/main")
	public String Main(HttpServletRequest request, Model model) {
		System.out.println("first visit >>> ");
		
		List<String> resultList = new ArrayList<String>();
		
		resultList.add("AAA");
		resultList.add("BBB");
		resultList.add("CCC");
		resultList.add("DDD");
		resultList.add("EEE");
		resultList.add("FFF");
		
		model.addAttribute("resultList", resultList);
		
		logger.info("resultList >>> {}", resultList);
		
		return "content/main";
	}
}