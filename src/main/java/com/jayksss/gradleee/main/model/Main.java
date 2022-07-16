package com.jayksss.gradleee.main.model;

import lombok.Builder;
import lombok.Data;

@Builder @Data
public class Main {
	
	private int actorId;
	private String firstName;
	private String lastName;
	private String lastUpdate;
}