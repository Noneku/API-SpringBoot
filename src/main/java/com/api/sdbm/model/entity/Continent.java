package com.api.sdbm.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "continent")
public class Continent {
    @Id
    @Column(name = "ID_CONTINENT", nullable = false)
    private Integer id;

    @Column(name = "NOM_CONTINENT", nullable = false, length = 25)
    private String nomContinent;

}