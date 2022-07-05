package com.jayksss.gradleee.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class MainController {

	@GetMapping("/main")
	@ResponseBody
	public String Main(HttpServletRequest request) {
		System.out.println("first visit console >>> ");
		return "first visit";
	}
}