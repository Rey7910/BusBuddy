package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RutaRepository extends CrudRepository<Ruta,Integer>{
    public List<Ruta> findByIdConductor(int idConductor);
}
