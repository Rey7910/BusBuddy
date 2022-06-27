package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;

import com.sun.istack.NotNull;

@Entity
@Table(name="personal", uniqueConstraints = @UniqueConstraint(columnNames = "pin"))
public class Personal implements Serializable{
    private static final long serialVersionUID = 4L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpersonal")
    private int idpersonal;
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @NotNull
    @Column(name = "idempresa")
    private int idempresa;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "telefono")
    private String telefono;
    @Column(name = "cargo")
    private String cargo;
    @Column(name = "eps")
    private String eps;
    @Column(name = "ciudad")
    private String ciudad;
    @Column(name = "id")
    private long id;
    @Column(name = "pin")
    private String pin;


    public Personal(int idusuario, int idempresa, String nombre, String apellido, String telefono, String cargo,
            String eps, String ciudad, long id, String pin) {
        this.idusuario = idusuario;
        this.idempresa = idempresa;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.cargo = cargo;
        this.eps = eps;
        this.ciudad = ciudad;
        this.id = id;
        this.pin = pin;
    }

    public Personal() {
    }

    public int getIdpersonal() {
        return idpersonal;
    }

    public void setIdpersonal(int idpersonal) {
        this.idpersonal = idpersonal;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEps() {
        return eps;
    }

    public void setEps(String eps) {
        this.eps = eps;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

}
