package com.nt.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.nt.model.Movie;
//@Transactional
public interface IMovieRepo  extends JpaRepository<Movie , Integer>{

	@Query("Update Movie set rating=:newRating where mname=:name")
	@Modifying
	@Transactional
	public int modifyRatingByMovieName(float newRating ,String name);

	@Query("delete from  Movie where year>=:start and year<=:end")
	@Modifying
	@Transactional
	public int deleteMovieByYearRange(String start ,String end);

}
