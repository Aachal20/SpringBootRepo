package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.nt.entity.Movie;
import com.nt.repository.IMovieRepo;

@Service("movieService")
public class MovieMgmtServiceImpl implements IMovieMgmtService {

	@Autowired // inject the dynamically generated proxy class object
	IMovieRepo movieRepo; // HAS-A property

	@Override
	public String registerMovie(Movie movie) {
		System.out.println("In Memory proxy class name ::" + movieRepo.getClass() + "......");
		// +Arrays.toString(movieRepo.getClass().getInterfaces()));

		System.out.println("Before Saving");
		Movie movie1 = movieRepo.save(movie);
		// movieRepo.save(movie);
		System.out.println("After Saving");

		return "Movie is registered with ID Value::" + movie1.getMid();
	}

	@Override
	public long fetchMoviesCount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean checkMovieById(Integer mid) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Movie> fetchAllMovies() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Movie> fetchAllMoviesByIds(List<Integer> mids) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Movie fetchMovieById(Integer mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Movie> gatherMovieById(Integer mid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String groupMovieRegistration(List<Movie> movieList) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * public long fetchMoviesCount() { return movieRepo.count();
	 * 
	 * }
	 * 
	 * @Override public boolean checkMovieById(Integer mid) {
	 * 
	 * return movieRepo.existsById(mid); } //findAll()
	 * 
	 * @Override public Iterable<Movie> fetchAllMovies() {
	 * 
	 * return movieRepo.findAll(); } //findAllByIds() method
	 * 
	 * @Override public Iterable<Movie> fetchAllMoviesByIds(List<Integer> mids) { //
	 * TODO Auto-generated method stub return movieRepo.findAllById(mids); }
	 * 
	 * 
	 * //findById(ID id)
	 * 
	 * @Override public Movie fetchMovieById(Integer mid) { Optional<Movie>
	 * opt=movieRepo.findById(mid); if(opt.isPresent()) return opt.get(); else throw
	 * new IllegalArgumentException("Record not found"); }
	 * 
	 * @Override public Movie fetchMovieById(Integer mid) { return
	 * movieRepo.findById(mid).orElseThrow(() -> new
	 * IllegalArgumentException("recod not found"));
	 * 
	 * }
	 * 
	 * 
	 * @Override public Movie fetchMovieById(Integer mid) { return
	 * movieRepo.findById(mid).orElse(new Movie());
	 * 
	 * }
	 * 
	 * @Override public Optional<Movie> gatherMovieById(Integer mid) {
	 * Optional<Movie> opt=movieRepo.findById(mid);
	 * 
	 * return opt.isEmpty() ? Optional.empty():opt;
	 * 
	 * }
	 * 
	 * @Override public String groupMovieRegistration(List<Movie> movieList) {
	 * Iterable<Movie> savedMovies= movieRepo.saveAll(movieList); List<Integer>
	 * listIds = new ArrayList(); if(savedMovies!=null &&
	 * ((List<Movie>)savedMovies).size()>0) { savedMovies.forEach(m->{
	 * listIds.add(m.getMid());
	 * 
	 * }); }//if
	 * 
	 * return listIds.toString()+"movies are saved"; }//method
	 */}
