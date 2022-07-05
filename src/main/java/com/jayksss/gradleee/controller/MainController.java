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

import com.jayksss.gradleee.model.SalaryModel;

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
		
		//salary 객체 리스트 변수
		List<SalaryModel> salaryList = new ArrayList<SalaryModel>();
		
		//Salary model
		SalaryModel salaryModel = new SalaryModel();
		
		// 첫 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(1);
		salaryModel.setName("AAA");
		salaryModel.setEmail("AAA@example.com");		
		salaryList.add(salaryModel);
		
		
		// 두 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(2);
		salaryModel.setName("BBB");
		salaryModel.setEmail("BBB@example.com");
		salaryList.add(salaryModel);

		
		// 세 번째 데이터
		salaryModel = new SalaryModel();
		salaryModel.setId(3);
		salaryModel.setName("CCC");
		salaryModel.setEmail("CCC@example.com");
		salaryList.add(salaryModel);
		
		model.addAttribute("salaryList", salaryList);
		
		logger.info("salaryList >>> {}", salaryList);
		
		return "content/main";
	}
}