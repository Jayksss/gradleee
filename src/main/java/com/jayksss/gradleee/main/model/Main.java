package com.jayksss.gradleee.main.model;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

@Builder @Data
public class Main {	
	private int id;	
	@NonNull @Builder.Default private String name = "NULL NAME";
	private String email;
}