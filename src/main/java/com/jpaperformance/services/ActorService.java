package com.jpaperformance.services;

import com.jpaperformance.dto.ActorLastFirstName;

import java.util.List;

public interface ActorService {
    List<ActorLastFirstName> getAllActorsLastFirstNames();
}
