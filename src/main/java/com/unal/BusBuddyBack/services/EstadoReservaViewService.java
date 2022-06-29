package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.EstadoReservaView;
import com.unal.BusBuddyBack.repository.EstadoReservaViewRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class EstadoReservaViewService implements IEstadoReservaViewService{
    @Autowired
    private EstadoReservaViewRespository data;
    @Override
    public List<EstadoReservaView> listar() {
        return (List<EstadoReservaView>) data.findAll();
    }

    @Override
    public Optional<EstadoReservaView> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public EstadoReservaView save(EstadoReservaView element) {
        return null;
    }

    @Override
    public void delete(EstadoReservaView element) {

    }

    @Override
    public void deleteId(int id) {

    }
}
