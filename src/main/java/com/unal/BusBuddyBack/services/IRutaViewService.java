package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;

import java.util.List;

public interface IRutaViewService extends IService<RutaView>{
    public List<RutaView> listarConductorId(int id);
}
