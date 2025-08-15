package com.example.demo.repository;

import java.util.List;

import com.example.demo.entity.Movie;

public interface MovieRepository {

	List<Movie> selectByNameWildcard(String movieName);

}
