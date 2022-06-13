package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name="empresa")
public class Empresa implements Serializable {
    private static final long serialVersionUID = 5L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idempresa")
    private int idempresa;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "nit")
    private String nit;
    @Column(name = "email")
    private String email;

    
    public Empresa(int idempresa, String nombre, String nit, String email) {
        this.idempresa = idempresa;
        this.nombre = nombre;
        this.nit = nit;
        this.email = email;
    }


    public Empresa() {
    }


    public int getIdempresa() {
        return idempresa;
    }


    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getNit() {
        return nit;
    }


    public void setNit(String nit) {
        this.nit = nit;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }
    
}
