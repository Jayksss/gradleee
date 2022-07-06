package com.jayksss.gradleee.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.jayksss.gradleee.model.SalaryModel;

@Repository
@Mapper
public interface SalaryMapper {
	
	List<SalaryModel> getSalary();
}