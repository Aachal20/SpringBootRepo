package com.nt.service;

import java.util.List;
import java.util.Optional;

import com.nt.entity.Movie;

//service Impl class
public interface IMovieMgmtService {
   public String registerMovie(Movie movie);               //save()                             RT:
	public long fetchMoviesCount();                                   //count()                           RT:LONG

  public boolean checkMovieById(Integer mid);      	//existById(ID id)             RT:BOOLEAN
  public Iterable<Movie>  fetchAllMovies();                 //findAll()                          RT:ITERABLE
  public Iterable<Movie> fetchAllMoviesByIds(List<Integer> mids);
  public Movie fetchMovieById(Integer mid);
  public Optional<Movie> gatherMovieById(Integer mid);          //saveAll()     RT:Iterable
  public  String groupMovieRegistration(List<Movie> movieList);
  
}

