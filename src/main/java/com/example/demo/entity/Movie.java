package com.example.demo.entity;

//すべてのフィールドを初期化するコンストラクタを生成
import lombok.AllArgsConstructor;
//getter setter
import lombok.Data;
//引数を指定しないコンストラクタを生成
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {

	private int MovieId;
	private String MovieTitle;
	private String MovieGenre;
	private String MovieDirector;
	
	
	

		
	
	
}
