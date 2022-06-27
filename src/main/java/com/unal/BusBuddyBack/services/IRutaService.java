package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;

import java.util.List;

public interface IRutaService extends IService<Ruta>{
    public List<Ruta> listarConductorId(int id);
}