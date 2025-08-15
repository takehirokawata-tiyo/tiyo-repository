package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Movie;

public interface MovieListService {

	List<Movie> findByNameWildcard(String movieName);

}
