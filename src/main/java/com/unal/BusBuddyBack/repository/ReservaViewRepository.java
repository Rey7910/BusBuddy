package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.entidades.ReservaView;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ReservaViewRepository extends CrudRepository<ReservaView,Integer> {
    public List<ReservaView> findByIdUsuarioAndEstado(int idUsuario, int estado);
    public List<ReservaView> findByIdUsuario(int idUsuario);
}
