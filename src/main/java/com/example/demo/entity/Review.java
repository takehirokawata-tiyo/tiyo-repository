package com.example.demo.entity;

import java.sql.Date;

import lombok.Data;

@Data
public class Review {

	private Integer movieId;
	private String userId;
	private Date visitDate;
	private Integer rating;
	private String comment;

}
