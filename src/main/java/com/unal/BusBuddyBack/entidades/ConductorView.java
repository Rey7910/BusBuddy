package com.unal.BusBuddyBack.entidades;

import com.sun.istack.NotNull;
import org.hibernate.annotations.Immutable;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Immutable

@Table(name= "info_conductores" )
public class ConductorView implements Serializable {
    private static final long serialVersionUID = 6941689238517063607L;
    @Id
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
    @Column(name="nombre")
    private String nombre;
    @Column(name="apellido")
    private String apellido;

    public ConductorView() {
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
}
