package com.jpaperformance.services;

import com.jpaperformance.dto.FilmTitle;
import com.jpaperformance.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FilmServiceImpl implements FilmService {

    public final FilmRepository filmRepository;

    @Override
    public List<FilmTitle> findFilmsByActorAndReleaseYearAndLanguage(
        String firstName, String lastName, Integer releaseYear, String language) {

        return filmRepository.findFilmsByActorAndReleaseYearAndLanguage(firstName, lastName, releaseYear, language);
    }



}
