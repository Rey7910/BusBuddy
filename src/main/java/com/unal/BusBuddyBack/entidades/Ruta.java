package com.unal.BusBuddyBack.entidades;


import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table (name= "ruta" ) //nombre en base de datos

public class Ruta implements Serializable {
    private static final long serialVersionUID = 8386071298071949305L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idruta")
    private int idRuta;
    @Column(name="idconductor")
    private int idConductor; //c
    @NotNull
    @Column(name="idempresa")
    private int idEmpresa;
    @Column(name="idbus")
    private int idBus;
    @Column(length=45, name="estado" )
    private String estado;
    @NotNull
    @Column(name="origen")
    private int origen;
    @NotNull
    @Column(name="destino")
    private int destino;
    @Column(name="fecha_salida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaSalida;
    @Column(name="fecha_llegada")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaLlegada;
    @Column(name="precio")
    private int precio;

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public Ruta() {
    }

    public Ruta(int idRuta, int idConductor, int idEmpresa, int idBus, String estado, int origen, int destino, Date fechaSalida, Date fechaLlegada) {
        this.idRuta = idRuta;
        this.idConductor = idConductor;
        this.idEmpresa = idEmpresa;
        this.idBus = idBus;
        this.estado = estado;
        this.origen = origen;
        this.destino = destino;
        this.fechaSalida = fechaSalida;
        this.fechaLlegada = fechaLlegada;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdBus() {
        return idBus;
    }

    public void setIdBus(int idBus) {
        this.idBus = idBus;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getOrigen() {
        return origen;
    }

    public void setOrigen(int origen) {
        this.origen = origen;
    }

    public int getDestino() {
        return destino;
    }

    public void setDestino(int destino) {
        this.destino = destino;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public Date getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(Date fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }
}