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
@Table(name = "FABRICANT")
public class Fabricant {
    @Id
    @Column(name = "ID_FABRICANT", nullable = false)
    private Integer id;

    @Column(name = "NOM_FABRICANT", nullable = false, length = 40)
    private String nomFabricant;

}