package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table (name = "reserva" )
public class Reserva implements Serializable{
    private static final long serialVersionUID = 10L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idreserva; 
    @NotNull
    @Column(name="idruta")
    private int idruta;
    @NotNull
    @Column(name="idusuario")
    private int idusuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="id")
    private long id; //cedula, número de identificación
    @Column(name="telefono")
    private long telefono;
    @Column(name="telefono_emergencia")
    private long telefono_emergencia;
    @Column(name="silla")
    private int silla;
    
    public Reserva() {
    }

    public Reserva(int idruta, int idusuario, String nombre, String apellido, long id, long telefono,
            long telefono_emergencia, int silla) {
        this.idruta = idruta;
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.id = id;
        this.telefono = telefono;
        this.telefono_emergencia = telefono_emergencia;
        this.silla = silla;
    }

    public int getIdreserva() {
        return idreserva;
    }

    public void setIdreserva(int idreserva) {
        this.idreserva = idreserva;
    }

    public int getIdruta() {
        return idruta;
    }

    public void setIdruta(int idruta) {
        this.idruta = idruta;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public long getTelefono_emergencia() {
        return telefono_emergencia;
    }

    public void setTelefono_emergencia(long telefono_emergencia) {
        this.telefono_emergencia = telefono_emergencia;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    } 
}
