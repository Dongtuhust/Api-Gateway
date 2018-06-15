package com.javainuse.repositries;
import org.springframework.data.repository.CrudRepository;

import com.javainuse.model.Film;


public interface FilmRepository extends CrudRepository<Film, Integer>{
	
}
