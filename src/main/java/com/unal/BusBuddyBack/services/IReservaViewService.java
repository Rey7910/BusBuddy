package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.entidades.ReservaView;

import java.util.List;

public interface IReservaViewService extends IService<ReservaView>{
    public List<ReservaView> listarPorUsuario(int idUsuario);
    public List<ReservaView> listarPorUsuarioYEstado(int idUsuario,int estado);
}
