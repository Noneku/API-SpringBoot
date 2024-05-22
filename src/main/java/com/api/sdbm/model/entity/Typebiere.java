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
@Table(name = "typebiere")
public class Typebiere {
    @Id
    @Column(name = "ID_TYPE", nullable = false)
    private Integer id;

    @Column(name = "NOM_TYPE", nullable = false, length = 25)
    private String nomType;

}