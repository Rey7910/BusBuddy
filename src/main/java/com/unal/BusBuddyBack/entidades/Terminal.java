package com.unal.BusBuddyBack.entidades;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="terminal")
public class Terminal implements Serializable {
    private static final long serialVersionUID = -7776397522474366809L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idterminal")
    private int id;
    @Column(name="idalterno")
    private Integer idAlterno;
    @Column(name="Nombre")
    private String nombre;
    @Column(name="ciudad")
    private String ciudad;
    @Column(name="capacidad")
    private int capacidad;
    @Column(name="estado")
    private String estado;

    public Terminal() {
    }

    public Terminal(int id, int idAlterno, String nombre, String ciudad, int capacidad, String estado) {
        this.id = id;
        this.idAlterno = idAlterno;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.capacidad = capacidad;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getIdAlterno() {
        return idAlterno;
    }

    public void setIdAlterno(Integer idAlterno) {
        this.idAlterno = idAlterno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
