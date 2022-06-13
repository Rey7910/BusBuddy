package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table(name="bus")
public class Bus implements Serializable{
    private static final long serialVersionUID = 7L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idbus")
    private int idbus;
    @NotNull
    @Column(name = "idempresa")
    private int idempresa;
    @Column(name = "placa")
    private int placa;
    @Column(name = "marca")
    private int marca;
    @Column(name = "SOAT")
    private int SOAT;
    @Column(name = "sillas")
    private int sillas;
    
    public Bus() {
    }

    public Bus(int idbus, int idempresa, int placa, int marca, int SOAT, int sillas) {
        this.idbus = idbus;
        this.idempresa = idempresa;
        this.placa = placa;
        this.marca = marca;
        this.SOAT = SOAT;
        this.sillas = sillas;
    }
    public int getIdbus() {
        return idbus;
    }
    public void setIdbus(int idbus) {
        this.idbus = idbus;
    }
    public int getIdempresa() {
        return idempresa;
    }
    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }
    public int getPlaca() {
        return placa;
    }
    public void setPlaca(int placa) {
        this.placa = placa;
    }
    public int getMarca() {
        return marca;
    }
    public void setMarca(int marca) {
        this.marca = marca;
    }
    public int getSOAT() {
        return SOAT;
    }
    public void setSOAT(int sOAT) {
        SOAT = sOAT;
    }
    public int getSillas() {
        return sillas;
    }
    public void setSillas(int sillas) {
        this.sillas = sillas;
    }
}
