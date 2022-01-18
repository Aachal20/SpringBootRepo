package com.nt.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.repository.IMovieRepo;
@Component
public class NonSelectOperationsRunner implements CommandLineRunner {
	@Autowired
	private IMovieRepo  repo;
	@Override
	public void run(String... args) throws Exception {
		System.out.println("Updateting::"  +repo.modifyRatingByMovieName(9.9f, "Don")+"for Movies");
		System.out.println("Updateting::"  +repo.deleteMovieByYearRange("2019","2052")+" Movies are deleted");

	}

}
