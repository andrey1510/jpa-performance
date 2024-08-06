package com.jpaperformance.services;

import com.jpaperformance.dto.FilmTitle;

import java.util.List;

public interface FilmService {
    List<FilmTitle> findFilmsByActorAndReleaseYearAndLanguage(
        String firstName, String lastName, Integer releaseYear, String language);
}
