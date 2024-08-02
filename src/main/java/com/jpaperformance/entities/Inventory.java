package com.jpaperformance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import java.time.Instant;

@Getter
@Setter
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @ColumnDefault("nextval('inventory_inventory_id_seq'::regclass)")
    @Column(name = "inventory_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "film_id", nullable = false)
    private Film film;

    @Column(name = "store_id", nullable = false)
    private Short storeId;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}