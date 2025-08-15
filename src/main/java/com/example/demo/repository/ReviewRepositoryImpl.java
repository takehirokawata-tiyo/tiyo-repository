package com.example.demo.repository;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Review;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryImpl implements ReviewRepository {

	private final JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Review review) {

		String sql =
			" INSERT INTO movie_review " +
			" (id, user_id, visit_date, rating, comment) " +
			" VALUES (?, ?, ?, ?, ?) ";	

		jdbcTemplate.update(sql, review.getMovieId(),
								 review.getUserId(),
								 review.getVisitDate(),
								 review.getRating(),
								 review.getComment()		);
		
	}

}
