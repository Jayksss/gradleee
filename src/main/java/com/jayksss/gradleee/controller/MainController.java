package com.jayksss.gradleee.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jayksss.gradleee.model.SalaryModel;
import com.jayksss.gradleee.service.SalaryService;

@Controller
@RequestMapping("/")
public class MainController {
	
	//log 선언
	public final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	SalaryService salaryService;
	
	/**
	 * 메인
	 * @param request
	 * @param model
	 */
	@GetMapping("/main")
	public String Main(HttpServletRequest request, Model model) {
		System.out.println("first visit >>> ");
		
		//salary 객체 리스트 변수
		List<SalaryModel> salaryList = salaryService.getSalary();
		model.addAttribute("salaryList", salaryList);
		
		logger.info("salaryList >>> {}", salaryList);
		
		return "content/main";
	}
}