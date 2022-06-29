package com.unal.BusBuddyBack.entidades;

import org.hibernate.annotations.Immutable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
@Entity
@Immutable
@Table(name="contadores")
public class ContadoresView implements Serializable {
    private static final long serialVersionUID = -7180703769260811645L;
    @Id
    @Column(name="porcomenzar")
    private int rutasPorComenzar;
    @Column(name="encurso")
    private int rutasenCurso;
    @Column (name="demorado")
    private int rutasDemoradas;
    @Column(name="finalizado")
    private int rutasFinalizadas;

    public ContadoresView() {
    }

    public int getRutasPorComenzar() {
        return rutasPorComenzar;
    }

    public void setRutasPorComenzar(int rutasPorComenzar) {
        this.rutasPorComenzar = rutasPorComenzar;
    }

    public int getRutasenCurso() {
        return rutasenCurso;
    }

    public void setRutasenCurso(int rutasenCurso) {
        this.rutasenCurso = rutasenCurso;
    }

    public int getRutasDemoradas() {
        return rutasDemoradas;
    }

    public void setRutasDemoradas(int rutasDemoradas) {
        this.rutasDemoradas = rutasDemoradas;
    }

    public int getRutasFinalizadas() {
        return rutasFinalizadas;
    }

    public void setRutasFinalizadas(int rutasFinalizadas) {
        this.rutasFinalizadas = rutasFinalizadas;
    }
    /*
    create or replace view contadores as select * from contador_porcomenzar, contador_encurso,
 contador_demorado, contador_finalizado;
    */
}
