package com.javainuse.service;

import com.javainuse.model.Film;

public interface FilmService {
	public abstract Iterable<Film> listAllFilms();
	public abstract Film getFilmById(Integer id);
	public abstract Film saveFilm(Film film);
	public abstract void deleteFilm(Integer id);
}
