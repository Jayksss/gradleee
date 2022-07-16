package com.jayksss.gradleee.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jayksss.gradleee.main.mapper.MainMapper;
import com.jayksss.gradleee.main.model.Main;

@Service
public class MainService {
	
	@Autowired
	public MainMapper mainMapper;
	
	public List<Main> getActor() {
		return mainMapper.getActor();
	}
}