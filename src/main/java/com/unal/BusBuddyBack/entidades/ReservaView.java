package com.unal.BusBuddyBack.entidades;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.util.Date;

@Entity
@Immutable
@Table(name="info_reservas")
public class ReservaView {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idreserva")
    private int idReserva;
    @Column(name="idusuario")
    private int idUsuario;
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;
    @Column(name="id")
    private long id;
    @Column(name="silla")
    private int silla;
    @Column(name="estado")
    private int estado;
    @Column(name="fecha_salida")
    private Date fechaSalida;
    @Column(name="fecha_llegada")
    private Date fechaLlegada;
    @Column(name="origen")
    private String origen;
    @Column(name="destino")
    private String destino;

    public ReservaView() {
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSilla() {
        return silla;
    }

    public void setSilla(int silla) {
        this.silla = silla;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
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

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
