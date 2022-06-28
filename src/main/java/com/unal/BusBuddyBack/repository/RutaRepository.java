package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional
public interface RutaRepository extends CrudRepository<Ruta,Integer>{
    List<Ruta> findByIdConductor(int idConductor);

    @Modifying
    @Query("UPDATE Ruta r SET r.estado = :estado where r.idRuta = :id")
    void updateRutaSetEstadoForIdRuta(@Param("id") int idRuta,@Param("estado") String estado);
}
