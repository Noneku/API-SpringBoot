package com.api.sdbm.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "PAYS")
public class Pay {
    @Id
    @Column(name = "ID_PAYS", nullable = false)
    private Integer id;

    @Column(name = "NOM_PAYS", nullable = false, length = 40)
    private String nomPays;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CONTINENT", nullable = false)
    private Continent idContinent;

}