package com.unal.BusBuddyBack.entidades;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name="reserva")
public class Reserva implements Serializable {
    private static final long serialVersionUID = 490109428070011876L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idReserva;
    @NonNull
    @Column(name="idruta")
    private int idRuta;
    @Column(name="idusuario")
    private int idUsuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="id")
    private String id;
    @Column(name="telefono")
    private String telefono;
    @Column(name="telefono_emergencia")
    private String telefonoEmergencia;
    @Column(name="silla")
    private int silla;
    @Column(name="estado")
    private int estado;
    public Reserva() {
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefonoEmergencia() {
        return telefonoEmergencia;
    }

    public void setTelefonoEmergencia(String telefonoEmergencia) {
        this.telefonoEmergencia = telefonoEmergencia;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }
}
