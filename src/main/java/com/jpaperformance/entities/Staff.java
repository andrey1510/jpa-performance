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
@Table(name = "staff")
public class Staff {
    @Id
    @ColumnDefault("nextval('staff_staff_id_seq'::regclass)")
    @Column(name = "staff_id", nullable = false)
    private Integer id;

    @Column(name = "first_name", nullable = false, length = 45)
    private String firstName;

    @Column(name = "last_name", nullable = false, length = 45)
    private String lastName;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @OnDelete(action = OnDeleteAction.RESTRICT)
    @JoinColumn(name = "address_id", nullable = false)
    private Address address;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "store_id", nullable = false)
    private Short storeId;

    @ColumnDefault("true")
    @Column(name = "active", nullable = false)
    private Boolean active = false;

    @Column(name = "username", nullable = false, length = 16)
    private String username;

    @Column(name = "password", length = 40)
    private String password;

    @ColumnDefault("now()")
    @Column(name = "last_update", nullable = false)
    private Instant lastUpdate;

    @Column(name = "picture")
    private byte[] picture;

}