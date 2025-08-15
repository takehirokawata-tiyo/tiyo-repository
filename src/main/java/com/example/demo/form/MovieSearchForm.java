package com.example.demo.form;

import lombok.Data;

//getter setterメソッドなどが入ったアノテーション
@Data
public class MovieSearchForm {
	
	
	private String movieName;
	
	/*
	 * アノテーションを使用しない場合
	 * public String getMovieName(){
	 * 
	 * return this.movieName;
	 * 
	 * }
	 * 
	 * public void String setMovieName(final String movieName){
	 * 
	 * this.movieName = movieName;
	 * 
	 * }
	 * 
	 * 
	 * 
	 * */
	
	
}
