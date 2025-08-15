package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Movie;
import com.example.demo.form.MovieSearchForm;
import com.example.demo.service.MovieListService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MovieListController {

	private final MovieListService service;

	/*初期処理*/
	@GetMapping("/search")
	private String movieList(
			@ModelAttribute MovieSearchForm form) {
		return "movie-list";
	}

	/*検索ボタン押下時*/
	@PostMapping("/movie-search")
	private String movieSearch(
			@ModelAttribute MovieSearchForm form,
			Model model) {

		List<Movie> list = service.findByNameWildcard(form.getMovieName());

		model.addAttribute("movieList", list);

		return "movie-list";
	}

}
