package com.unal.BusBuddyBack.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.Reserva;

public interface ReservaRepository extends CrudRepository<Reserva,Integer>{
    public List<Reserva> findByIdUsuario(int idUsuario);
}
