package com.jpaperformance.controllers;

import com.jpaperformance.dto.ActorLastFirstName;
import com.jpaperformance.services.ActorService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequiredArgsConstructor
@RequestMapping("/api/actors")
@RestController
public class ActorController {

    private final ActorService actorService;

    @GetMapping("/first-last-names")
    public ResponseEntity<List<ActorLastFirstName>> getAllActorsLastFirstNames() {
        List<ActorLastFirstName> actors = actorService.getAllActorsLastFirstNames();
        return ResponseEntity.ok(actors);
    }

}
