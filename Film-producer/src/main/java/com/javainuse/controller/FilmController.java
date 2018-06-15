package com.javainuse.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.javainuse.model.Film;
import com.javainuse.service.FilmService;

@RestController
@RequestMapping("/film")
@Api(value="film")
public class FilmController {
	@Autowired
    private FilmService filmService;

    @ApiOperation(value = "View a list of available film",response = Iterable.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Successfully retrieved list"),
            @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
            @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
            @ApiResponse(code = 404, message = "The resource you were trying to reach is not found")
    }
    )
	@RequestMapping(value = "/film", method = RequestMethod.GET, produces = "application/json")
    public Iterable<Film> list(Model model){
        Iterable<Film> filmList = filmService.listAllFilms();
        return filmList;
    }
    
    @ApiOperation(value = "Search a film with an ID",response = Film.class)
    @RequestMapping(value = "/{id}", method= RequestMethod.GET, produces = "application/json")
    public Film showFilm(@PathVariable Integer id, Model model){
       Film film = filmService.getFilmById(id);
        return film;
    }

    @ApiOperation(value = "Update a film")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.PUT, produces = "application/json")
    public ResponseEntity<String> updateProduct(@PathVariable Integer id, @RequestBody Film film){
        Film storedFilm = filmService.getFilmById(id);
        storedFilm.setSku(film.getSku());
        storedFilm.setTitle(film.getTitle());
        storedFilm.setCategory(film.getCategory());
        storedFilm.setModijedAt(film.getModijedAt());
        storedFilm.setPrice(film.getPrice());
        filmService.saveFilm(storedFilm);
        return new ResponseEntity<String>("Film updated successfully", HttpStatus.OK);
    }

    @ApiOperation(value = "Delete a film")
    @RequestMapping(value="/delete/{id}", method = RequestMethod.DELETE, produces = "application/json")
    public ResponseEntity<String> delete(@PathVariable Integer id){
        filmService.deleteFilm(id);
        return new ResponseEntity<String>("Film deleted successfully", HttpStatus.OK);

    }
	
}
