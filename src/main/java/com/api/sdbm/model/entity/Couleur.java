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
@Table(name = "couleur")
public class
Couleur {
    @Id
    @Column(name = "ID_COULEUR", nullable = false)
    private Integer id;

    @Column(name = "NOM_COULEUR", nullable = false, length = 25)
    private String nomCouleur;

}