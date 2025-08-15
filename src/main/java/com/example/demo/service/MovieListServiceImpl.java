package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Movie;
import com.example.demo.repository.MovieRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class MovieListServiceImpl implements MovieListService {
	
	private final MovieRepository repository;

	@Override
	public List<Movie> findByNameWildcard(String movieName) {
		
		List<Movie> list = repository.selectByNameWildcard(movieName);
		// TODO 自動生成されたメソッド・スタブ
		return list;
	}

}
