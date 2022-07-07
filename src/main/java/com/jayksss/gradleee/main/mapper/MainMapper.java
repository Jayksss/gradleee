package com.jayksss.gradleee.main.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jayksss.gradleee.main.model.Main;

@Mapper
public interface MainMapper {
	List<Main> getSalary();
}