package com.jayksss.gradleee.main.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

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
	 * 메인
	 * @param request
	 * @param model
	 */
	@GetMapping("/main")
	public String Main(HttpServletRequest request, Model model) {
		System.out.println("<<<<<<<<<<<< Main Visit >>>>>>>>>>>>");
		
		List<Map<String, Object>> actorList = mainService.getActor();
		model.addAttribute("actorList", actorList);
		
		//gson 적용 : view에 json 형태로 전달
		Gson gson = new Gson();
		String list = gson.toJson(actorList);
		model.addAttribute("list", list);
		
		return "content/main";
	}
	
	@GetMapping("/bbs")
	public String bbs() {
		return "content/bbs";
	}
}