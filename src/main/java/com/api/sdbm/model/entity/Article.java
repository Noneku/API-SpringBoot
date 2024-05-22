package com.api.sdbm.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "ARTICLE")
public class Article {
    @Id
    @Column(name = "ID_ARTICLE", nullable = false)
    private Integer id;

    @Column(name = "NOM_ARTICLE", nullable = false, length = 60)
    private String nomArticle;

    @Column(name = "PRIX_ACHAT", nullable = false, precision = 19, scale = 4)
    private BigDecimal prixAchat;

    @Column(name = "VOLUME")
    private Integer volume;

    @Column(name = "TITRAGE")
    private Double titrage;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_MARQUE", nullable = false)
    private Marque idMarque;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_COULEUR")
    private Couleur idCouleur;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TYPE")
    private Typebiere idType;

}