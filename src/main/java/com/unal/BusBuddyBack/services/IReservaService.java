package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Reserva;

import java.util.List;

public interface IReservaService extends IService<Reserva>{
    public List<Reserva> listarPorUsuario(int idUsuario);
    public List<Reserva> listarPorUsuarioYEstado(int idUsuario,int estado);
    public List<Reserva> listarPorRuta(int idRuta);
    public List<Reserva> listarPorRutaYEstado(int idRuta,int estado);
}
