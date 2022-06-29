package com.unal.BusBuddyBack.entidades;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Immutable
@Table(name="estadosReserva")
public class EstadoReservaView implements Serializable {
    private static final long serialVersionUID = 2765233482433485056L;
    @Id
    @Column(name="abordados")
    private int abordados;
    @Column(name="noabordados")
    private int noAbordados;
    @Column(name="porcomenzar")
    private int porComenzar;

    public EstadoReservaView() {
    }

    public int getAbordados() {
        return abordados;
    }

    public void setAbordados(int abordados) {
        this.abordados = abordados;
    }
}
