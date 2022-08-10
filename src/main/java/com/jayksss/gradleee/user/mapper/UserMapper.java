package com.jayksss.gradleee.user.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.jayksss.gradleee.user.model.User;

@Mapper
public interface UserMapper {
	
	List<User> selectUser();
	void inserUser(Map<String, Object> param);
}