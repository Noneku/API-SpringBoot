package com.api.sdbm.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.Hibernate;

import java.util.Objects;

@Getter
@Setter
@Embeddable
public class TicketId implements java.io.Serializable {
    private static final long serialVersionUID = -3750614259758764328L;
    @Column(name = "ANNEE", nullable = false)
    private Integer annee;

    @Column(name = "NUMERO_TICKET", nullable = false)
    private Integer numeroTicket;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        TicketId entity = (TicketId) o;
        return Objects.equals(this.annee, entity.annee) &&
                Objects.equals(this.numeroTicket, entity.numeroTicket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(annee, numeroTicket);
    }

}