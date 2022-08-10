package com.jayksss.gradleee.user.model;

import java.sql.Date;

import lombok.Data;

@Data
public class User {
	
	private int no;
	private String userId;
	private String password;
	private String userName;
	private String job;
	private Date registDate;
}