package com.jayksss.gradleee.user.model;

import java.sql.Date;

import lombok.Data;

@Data
public class User {
	
	private int no;
	private String id;
	private String password;
	private String name;
	private String job;
	private Date registDate;
}