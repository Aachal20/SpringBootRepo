package com.nt.runner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.CommandLineRunner;

import com.nt.entity.Movie;
import com.nt.service.IMovieMgmtService;

public class CrudRepoTestRunner implements CommandLineRunner {
	private IMovieMgmtService service;

	@Override
	public void run(String... args) throws Exception {
		//invoke servie method
		Movie movie = new Movie();
		movie.setMname("bbb");
		movie.setYear("2023");
		movie.setRating(4.5f);	
		try {
			System.out.println(service.registerMovie(movie));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

		/*
		 * System.out.
		 * println("-------------------------for count() method-------------------------------"
		 * ); try { System.out.println("record counr:::" +service.fetchMoviesCount()); }
		 * catch(Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.
		 * println("-------------------------for findAll() method--------------------------------"
		 * ); try { Iterable<Movie> list =service.fetchAllMovies(); for(Movie movies
		 * :list) { //enhanced for loop System.out.println(movies); }
		 * System.out.println("-------------------"); list.forEach(movies->{ //forEach()
		 * method System.out.println(movies);
		 * 
		 * });
		 * 
		 * System.out.println("-------------------"); list.forEach(movies->
		 * System.out.println(movies)); //forEach() method
		 * 
		 * System.out.println("-------------------"); list.forEach(
		 * System.out::println); //forEach() method+static method reference
		 * 
		 * 
		 * System.out.println("-------------------");
		 * Arrays.asList(list).stream().forEach(System.out::println); //forEach()
		 * method+streaming API +static method reference
		 * 
		 * } catch(Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.
		 * println("-------------------------for findAllByIds() method--------------------------------"
		 * ); try { List<Integer> IdsList = new ArrayList(); IdsList.add(189);
		 * IdsList.add(1); System.out.println("Movies are::"
		 * +service.fetchAllMoviesByIds(IdsList));
		 * System.out.println("--------------------------");
		 * System.out.println("Movies are::"
		 * +service.fetchAllMoviesByIds(List.of(189,1)));
		 * System.out.println("--------------------------");
		 * System.out.println("Movies are::"
		 * +service.fetchAllMoviesByIds(Arrays.asList(189,1)));
		 * 
		 * } catch(Exception e){ e.printStackTrace();
		 * 
		 * } System.out.
		 * println("-------------------------for findByIds() method--------------------------------"
		 * ); try { System.out.println("18 movie is ::" +service.fetchMovieById(18));
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * System.out.println(e.getMessage()); }
		 * 
		 * 
		 * System.out.
		 * println("-------------------------for findByIds() method--------------------------------"
		 * ); try { Optional<?> opt= service.gatherMovieById(18); if(!opt.isEmpty())
		 * System.out.println("189 movie" +opt.get()); else
		 * System.out.println("record not found");
		 * 
		 * } catch(Exception e) { e.printStackTrace();
		 * System.out.println(e.getMessage()); }
		 * 
		 * System.out.
		 * println("-------------------------SaveAll() method----------------"); try {
		 * //String result=service.groupMovieRegistration(List.of(new Movie("RRRR"
		 * ,"2022" , 5.6f),new Movie("hh" ,"2022" , 5.6f),new Movie("RRRR" ,"2026" ,
		 * 5.0f))); // //System.out.println(result); } catch(Exception e){
		 * e.printStackTrace();
		 * 
		 * }
		 */
	}
}
