package com.jayksss.gradleee.main.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayksss.gradleee.main.mapper.MainMapper;

@Service
public class MainService {
	
	@Autowired
	public MainMapper mainMapper;
	
	public List<Map<String, Object>> getActor() {
		return mainMapper.getActor();
	}
}