package com.jayksss.gradleee.bbs.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jayksss.gradleee.bbs.model.Bbs;

@Mapper
public interface BbsMapper {
	
	List<Bbs> selectBbsList();
}