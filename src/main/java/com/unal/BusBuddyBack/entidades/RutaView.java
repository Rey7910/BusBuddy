package com.unal.BusBuddyBack.entidades;

import org.hibernate.annotations.Immutable;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Entity
@Immutable
@Table(name= "info_rutas" ) //nombre en base de datos
public class RutaView implements Serializable {
    private static final long serialVersionUID = 2952519884827823773L;
    @Id
    @Column(name="idruta")
    private int idRuta;
    @Column(name="empresa")
    private String empresa;
    @Column(name="conductor")
    private String conductor;
    @Column(name="terminal_origen")
    private String origenT;
    @Column(name="ciudad_origen")
    private String origen;
    @Column(name="terminal_destino")
    private String destinoT;
    @Column(name="ciudad_destino")
    private String destino;
    @Column(name="bus")
    private Integer idBus;
    @Column(name="fecha_salida")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaSalida;
    @Column(name="fecha_llegada")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date fechaLlegada;
    @Column(name="precio")
    private int precio;
    @Column(name="estado")
    private String estado;
    @Column(name="idconductor")
    private int idConductor; //c
    public RutaView() {
    }
    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }



    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public String getConductor() {
        return conductor;
    }

    public void setConductor(String conductor) {
        this.conductor = conductor;
    }

    public String getOrigenT() {
        return origenT;
    }

    public void setOrigenT(String origenT) {
        this.origenT = origenT;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestinoT() {
        return destinoT;
    }

    public void setDestinoT(String destinoT) {
        this.destinoT = destinoT;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Integer getIdBus() {
        return idBus;
    }

    public void setIdBus(Integer idBus) {
        this.idBus = idBus;
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

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
