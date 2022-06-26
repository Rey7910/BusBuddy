package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;
import com.sun.istack.NotNull;
@Entity
@Table(name="administrador_empresa")
public class AdministradorEmpresa implements Serializable{
    private static final long serialVersionUID = 9L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idadministrador_empresa")
    private int idadministrador_empresa; 
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @NotNull
    @Column(name = "idempresa")
    private int idempresa;
    @Column(name = "id")
    private long id;
    @Column(name = "eps")
    private int eps;
    @Column(name = "ciudad")
    private int ciudad;

    public AdministradorEmpresa() {
    }

    public AdministradorEmpresa(int idadministrador_empresa, int idusuario, int idempresa, long id, int eps,
            int ciudad) {
        this.idadministrador_empresa = idadministrador_empresa;
        this.idusuario = idusuario;
        this.idempresa = idempresa;
        this.id = id;
        this.eps = eps;
        this.ciudad = ciudad;
    }
    public int getIdadministrador_empresa() {
        return idadministrador_empresa;
    }
    public void setIdadministrador_empresa(int idadministrador_empresa) {
        this.idadministrador_empresa = idadministrador_empresa;
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
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public int getEps() {
        return eps;
    }
    public void setEps(int eps) {
        this.eps = eps;
    }
    public int getCiudad() {
        return ciudad;
    }
    public void setCiudad(int ciudad) {
        this.ciudad = ciudad;
    }
}
