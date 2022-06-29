package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;

import java.util.Date;
import java.util.List;

public interface IRutaViewService extends IService<RutaView>{
    List<RutaView> listarConductorId(int id);
    List<RutaView> consultaFiltrada(int origen, int destino, Date fechaSalida, int precioMin, int precioMax);
    List<RutaView> listarEmpresaId(int id);
}
