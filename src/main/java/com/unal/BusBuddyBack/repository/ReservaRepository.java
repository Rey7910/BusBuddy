package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Reserva;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservaRepository extends CrudRepository<Reserva,Integer> {
    public List<Reserva> findByIdUsuarioAndEstado(int idUsuario,int estado);
    public List<Reserva> findByIdUsuario(int idUsuario);
    public List<Reserva> findByIdRuta(int idRuta);
    public List<Reserva> findByIdRutaAndEstado(int idRuta,int estado);

}