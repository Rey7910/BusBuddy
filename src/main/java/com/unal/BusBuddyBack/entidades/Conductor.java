package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;
import java.text.SimpleDateFormat;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table(name="conductor")
public class Conductor implements Serializable {
    private static final long serialVersionUID = 6L;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconductor")
    private int idconductor;
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @NotNull
    @Column(name = "idempresa")
    private int idempresa;
    @Column(name = "id")
    private int id;
    @Column(name = "eps")
    private String eps;
    @Column(name = "ciudad")
    private String ciudad;
    
    public Conductor(int idconductor, int idusuario, int idempresa, int id, String eps, String ciudad) {
        this.idconductor = idconductor;
        this.idusuario = idusuario;
        this.idempresa = idempresa;
        this.id = id;
        this.eps = eps;
        this.ciudad = ciudad;
    }

    public Conductor() {
    }

    public int getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(int idconductor) {
        this.idconductor = idconductor;
    }

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }

    public int getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(int idempresa) {
        this.idempresa = idempresa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

}
