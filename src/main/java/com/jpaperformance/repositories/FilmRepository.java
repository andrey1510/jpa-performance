package com.jpaperformance.repositories;

import com.jpaperformance.dto.FilmTitle;
import com.jpaperformance.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film, Integer> {

    @Query("SELECT new com.jpaperformance.dto.FilmTitle(f.title)" +
        "FROM Film f " +
        "JOIN FilmActor fa ON f.id = fa.id.filmId " +
        "JOIN fa.actor a " +
        "JOIN f.language l " +
        "WHERE a.firstName = :firstName " +
            "AND a.lastName = :lastName " +
            "AND f.releaseYear = :releaseYear " +
            "AND l.name = :language"
    )
    List<FilmTitle> findFilmsByActorAndReleaseYearAndLanguage(
        String firstName, String lastName, Integer releaseYear, String language);

}
