package com.jpaperformance.repositories;

import com.jpaperformance.dto.ActorLastFirstName;
import com.jpaperformance.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Integer> {

    @Query("SELECT new com.jpaperformance.dto.ActorLastFirstName(" +
        "a.firstName, " +
        "a.lastName) " +
        "FROM Actor a " )
    List<ActorLastFirstName> getAllActorsFirstLastNames();

}
