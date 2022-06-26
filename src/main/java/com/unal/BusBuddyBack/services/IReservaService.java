package com.unal.BusBuddyBack.services;

import java.util.List;

import com.unal.BusBuddyBack.entidades.Reserva;

public interface IReservaService extends IService<Reserva>{
    public List<Reserva> listarUsuarioId(int id);
}
