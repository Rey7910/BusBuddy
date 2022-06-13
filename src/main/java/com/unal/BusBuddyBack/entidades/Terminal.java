package com.unal.BusBuddyBack.entidades;

public class Terminal {
    private int id;
    private int idAlterno;
    private String nombre;
    private String ciudad;
    private int capacidad;
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

    public int getIdAlterno() {
        return idAlterno;
    }

    public void setIdAlterno(int idAlterno) {
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
