package com.jpaperformance.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
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
@Table(name = "store")
public class Store {
    @Id
    @ColumnDefault("nextval('store_store_id_seq'::regclass)")
    @Column(name = "store_id", nullable = false)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "manager_staff_id", nullable = false)
    private Staff managerStaff;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

}