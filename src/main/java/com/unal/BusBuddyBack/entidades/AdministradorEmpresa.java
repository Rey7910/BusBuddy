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
    private String eps;
    @Column(name = "ciudad")
    private String ciudad;

    public AdministradorEmpresa() {
    }

    public AdministradorEmpresa(int idadministrador_empresa, int idusuario, int idempresa, long id, String eps,
            String ciudad) {
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
