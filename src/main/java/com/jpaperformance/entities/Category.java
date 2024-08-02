package com.jpaperformance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
    @Id
    @ColumnDefault("nextval('category_category_id_seq'::regclass)")
    @Column(name = "category_id", nullable = false)
    private Integer id;

    @Column(name = "name", nullable = false, length = 25)
    private String name;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}