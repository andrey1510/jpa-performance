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
import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @ColumnDefault("nextval('customer_customer_id_seq'::regclass)")
    @Column(name = "customer_id", nullable = false)
    private Integer id;

    @Column(name = "store_id", nullable = false)
    private Short storeId;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @Column(name = "email", length = 50)
    private String email;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @ColumnDefault("true")
    @Column(name = "activebool", nullable = false)
    private Boolean activebool = false;

    @ColumnDefault("('now'::text)::date")
    @Column(name = "create_date", nullable = false)
    private LocalDate createDate;

    @ColumnDefault("now()")
    @Column(name = "last_update")
    private Instant lastUpdate;

    @Column(name = "active")
    private Integer active;

}