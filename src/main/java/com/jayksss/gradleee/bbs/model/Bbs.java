package com.jayksss.gradleee.bbs.model;

import java.sql.Date;

import lombok.Data;

@Data
public class Bbs {
	
	private int no;
	private String title;
	private String description;
	private Date releaseYear;
	private int languageId;
	private int originalLanguageId;
	private int rentalDuration;
	private int rentalRate;
	private int length;
	private int  replacementCost;
	private String rating;
	private String specialFeatures;
	private Date lastUpdate;
}