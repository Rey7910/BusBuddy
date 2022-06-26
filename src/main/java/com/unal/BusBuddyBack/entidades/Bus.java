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
    private int idBus;
    @NotNull
    @Column(name = "idempresa")
    private int idEmpresa;
    @Column(name = "placa")
    private String placa;
    @Column(name = "marca")
    private String marca;
    @Column(name = "SOAT")
    private int SOAT;
    @Column(name = "sillas")
    private int sillas;
    
    public Bus() {
    }

    public Bus(int idBus, int idEmpresa, String placa, String marca, int SOAT, int sillas) {
        this.idBus = idBus;
        this.idEmpresa = idEmpresa;
        this.placa = placa;
        this.marca = marca;
        this.SOAT = SOAT;
        this.sillas = sillas;
    }
    public int getIdBus() {
        return idBus;
    }
    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }
    public int getIdEmpresa() {
        return idEmpresa;
    }
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
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
