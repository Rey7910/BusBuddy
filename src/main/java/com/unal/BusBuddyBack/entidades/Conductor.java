package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table(name="conductor")
public class Conductor implements Serializable {
    private static final long serialVersionUID = 6L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idconductor")
    private int idconductor;
    @NotNull
    @Column(name = "idusuario")
    private String idusuario;
    @NotNull
    @Column(name = "idempresa")
    private String idempresa;
    @Column(name = "id")
    private String id;
    @Column(name = "eps")
    private String eps;
    @Column(name = "ciudad")
    private String ciudad;
    
    public Conductor() {
    }

    public Conductor(int idconductor, String idusuario, String idempresa, String id, String eps, String ciudad) {
        this.idconductor = idconductor;
        this.idusuario = idusuario;
        this.idempresa = idempresa;
        this.id = id;
        this.eps = eps;
        this.ciudad = ciudad;
    }

    public int getIdconductor() {
        return idconductor;
    }

    public void setIdconductor(int idconductor) {
        this.idconductor = idconductor;
    }

    public String getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(String idusuario) {
        this.idusuario = idusuario;
    }

    public String getIdempresa() {
        return idempresa;
    }

    public void setIdempresa(String idempresa) {
        this.idempresa = idempresa;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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
