package com.unal.BusBuddyBack.entidades;

import java.io.Serializable;

import javax.persistence.*;
import com.sun.istack.NotNull;

@Entity
@Table(name="administrador_terminal")
public class AdministradorTerminal implements Serializable{
    private static final long serialVersionUID = 8L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idadministrador_terminal")
    private int idadministrador_terminal; 
    @NotNull
    @Column(name = "idusuario")
    private int idusuario;
    @NotNull
    @Column(name = "idterminal")
    private int idterminal;
    @Column(name = "id")
    private int id;
    @Column(name = "eps")
    private int eps;
    @Column(name = "ciudad")
    private int ciudad;

    public AdministradorTerminal() {
    }

    public AdministradorTerminal(int idadministrador_terminal, int idusuario, int idterminal, int id, int eps,
            int ciudad) {
        this.idadministrador_terminal = idadministrador_terminal;
        this.idusuario = idusuario;
        this.idterminal = idterminal;
        this.id = id;
        this.eps = eps;
        this.ciudad = ciudad;
    }
    public int getIdadministrador_terminal() {
        return idadministrador_terminal;
    }
    public void setIdadministrador_terminal(int idadministrador_terminal) {
        this.idadministrador_terminal = idadministrador_terminal;
    }
    public int getIdusuario() {
        return idusuario;
    }
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }
    public int getIdempresa() {
        return idterminal;
    }
    public void setIdempresa(int idempresa) {
        this.idterminal = idempresa;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
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
