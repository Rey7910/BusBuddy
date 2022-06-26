package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.ConductorView;
import com.unal.BusBuddyBack.entidades.RutaView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RutaViewRepository extends CrudRepository<RutaView,Integer> {
    public List<RutaView> findByIdConductor(int idConductor);

}
