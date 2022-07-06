package com.jayksss.gradleee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayksss.gradleee.mapper.SalaryMapper;
import com.jayksss.gradleee.model.SalaryModel;

@Service
public class SalaryService {
	
	@Autowired
	public SalaryMapper mapper;
	
	public List<SalaryModel> getSalary() {
		return mapper.getSalary();
	}
}