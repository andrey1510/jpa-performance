package com.jpaperformance.services;

import com.jpaperformance.dto.ActorLastFirstName;
import com.jpaperformance.repositories.ActorRepository;
import com.jpaperformance.repositories.FilmRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ActorServiceImpl implements ActorService {

    public final ActorRepository actorRepository;

    @Override
    public List<ActorLastFirstName> getAllActorsLastFirstNames() {
        return actorRepository.getAllActorsFirstLastNames();
    }

}
