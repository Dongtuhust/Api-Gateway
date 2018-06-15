package com.javainuse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


import org.apache.log4j.Logger;

import com.javainuse.model.Film;
import com.javainuse.repositries.FilmRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

@SpringBootApplication

public class FilmApplication implements ApplicationListener<ContextRefreshedEvent>{
	private Logger log = Logger.getLogger(FilmApplication.class);
	@Autowired
	private FilmRepository filmRepository;
	public static void main(String[] args) {
		SpringApplication.run(FilmApplication.class, args);
	}
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		loadFilms();
	}
	private void loadFilms() {
		Film film = new Film();
		film.setId(1);
		film.setPrice(50000);
		film.setSku("Qa4233232");
		film.setTitle("The Civil War");
		film.setCategory("Action");
		film.setCreateAt(null);
		film.setModijedAt(null);
		filmRepository.save(film);

		log.info("Saved Film - id: " + film.getId());

	}
}
