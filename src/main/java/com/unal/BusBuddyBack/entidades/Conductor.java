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
    private int idConductor;
    @NotNull
    @Column(name = "idusuario")
    private int idUsuario;
    @NotNull
    @Column(name = "idempresa")
    private int idEmpresa;
    @Column(name = "id")
    private int id;
    @Column(name = "eps")
    private String eps;
    @Column(name = "ciudad")
    private String ciudad;
    
    public Conductor(int idConductor, int idUsuario, int idEmpresa, int id, String eps, String ciudad) {
        this.idConductor = idConductor;
        this.idUsuario = idUsuario;
        this.idEmpresa = idEmpresa;
        this.id = id;
        this.eps = eps;
        this.ciudad = ciudad;
    }

    public Conductor() {
    }

    public int getIdConductor() {
        return idConductor;
    }

    public void setIdConductor(int idConductor) {
        this.idConductor = idConductor;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
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
