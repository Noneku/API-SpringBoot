package com.api.sdbm.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "MARQUE")
public class Marque {
    @Id
    @Column(name = "ID_MARQUE", nullable = false)
    private Integer id;

    @Column(name = "NOM_MARQUE", nullable = false, length = 40)
    private String nomMarque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_PAYS")
    private Pay idPays;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FABRICANT")
    private Fabricant idFabricant;

}