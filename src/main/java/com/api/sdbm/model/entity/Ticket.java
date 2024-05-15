package com.api.sdbm.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalTime;

@Getter
@Setter
@Entity
@Table(name = "TICKET")
public class Ticket {
    @EmbeddedId
    private TicketId id;

    @Column(name = "DATE_VENTE", nullable = false)
    private LocalDate dateVente;

    @Column(name = "HEURE_VENTE", nullable = false)
    private LocalTime heureVente;

}