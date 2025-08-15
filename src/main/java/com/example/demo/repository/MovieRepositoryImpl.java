package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Movie;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class MovieRepositoryImpl implements MovieRepository {

	private final JdbcTemplate jdbcTemplate;

	@Override
	public List<Movie> selectByNameWildcard(String movieName) {

		String sql = " SELECT                                 " +
				"   mr.id,                                    " +
				"   mr.title,                                 " +
				"   mr.genre,                                 " +
				"   mr.director                               " +
				" FROM                                        " +
				"  	movies mr                                 " +
				" WHERE                                       " +
				"  	mr.title LIKE ?                           " +
				" GROUP BY                                    " +
				"  	mr.id,                                    " +
				"  	mr.title,                                 " +
				"  	mr.genre,                                  " +
				"   mr.director                               " +
				" ORDER BY                                    " +
				"   mr.id                                     ";

		String p = "%" + movieName + "%"; // プレースホルダの値

		// SQLで検索（プレースホルダ：p）
		List<Map<String, Object>> list = jdbcTemplate.queryForList(sql, p);

		// 値の取得⇒結果の格納
		List<Movie> result = new ArrayList<Movie>(); // 結果の初期化
		for (Map<String, Object> one : list) {
			Movie movie = new Movie();
			movie.setMovieId((int) one.get("id"));
			movie.setMovieTitle((String) one.get("title"));
			movie.setMovieGenre((String) one.get("genre"));
			movie.setMovieDirector((String) one.get("director"));

			result.add(movie);
		}

		return result;
	}

	
}
