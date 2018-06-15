package com.javainuse.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javainuse.model.Film;
import com.javainuse.repositries.FilmRepository;

@Service
public class FilmServiceImpl implements FilmService{
    private final Logger logger = LoggerFactory.getLogger(FilmServiceImpl.class);
	private FilmRepository filmRepository;
	 
	@Autowired
    public void setFilmRepository(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }
	
	
	public Iterable<Film> listAllFilms() {
		logger.debug("listAllFilms called");
        return filmRepository.findAll();
	}
	
	
	public Film getFilmById(Integer id) {
		logger.debug("getFilmById called");
        return filmRepository.findOne(id);
	}
	
	
	public Film saveFilm(Film film) {
		logger.debug("saveFilm called");
        return filmRepository.save(film);
	}
	
	

	public void deleteFilm(Integer id) {
		 logger.debug("deleteFilm called");
	     filmRepository.delete(id);
	}
	 
}
