package com.jpaperformance.controllers;

import com.jpaperformance.dto.ActorLastFirstName;
import com.jpaperformance.dto.FilmTitle;
import com.jpaperformance.services.ActorService;
import com.jpaperformance.services.FilmService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/films")
@RestController
public class FilmController {

    private final FilmService filmService;

    @GetMapping("/actor-year-language-filter")
    public ResponseEntity<List<FilmTitle>> getFilmsByActorAndReleaseYearAndLanguage(
        String firstName, String lastName, Integer releaseYear, String language) {

        List<FilmTitle> films = filmService.findFilmsByActorAndReleaseYearAndLanguage(
            firstName, lastName, releaseYear, language);
        return ResponseEntity.ok(films);
    }

}
