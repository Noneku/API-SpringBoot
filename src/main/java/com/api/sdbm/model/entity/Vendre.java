package com.api.sdbm.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "vendre")
public class Vendre {
    @EmbeddedId
    private VendreId id;

    @MapsId("annee")
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ANNEE", nullable = false)
    private Article annee;

    @Column(name = "QUANTITE")
    private Integer quantite;

    @Column(name = "prix_vente", precision = 19, scale = 4)
    private BigDecimal prixVente;

}