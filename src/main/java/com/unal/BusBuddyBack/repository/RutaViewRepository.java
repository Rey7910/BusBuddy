package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.ConductorView;
import com.unal.BusBuddyBack.entidades.RutaView;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public interface RutaViewRepository extends CrudRepository<RutaView,Integer> {
    List<RutaView> findByIdConductor(int idConductor);
    List<RutaView> findByIdEmpresa(int idEmpresa);
   /* @Query("select mvt from Mouvements mvt where mvt.dateCompte between :x and :y")
    public Page<Mouvements> getMouvementsByDate(@Param("x")LocalDate dateBefore, @Param("y")LocalDate dateAfter, Pageable pageable);*/
    //@Query(value="")
    @Query("SELECT rv from RutaView rv WHERE rv.origenId= :origen AND rv.destinoId= :destino AND rv.fechaSalida= :fecha AND precio>= :min AND precio<= :max"
    )
    List<RutaView> findByFilters(@Param("origen")int origen, @Param("destino") int destino, @Param("fecha")   Date fechaSalida, @Param("min") int precioMin, @Param("max") int precioMax);
}
