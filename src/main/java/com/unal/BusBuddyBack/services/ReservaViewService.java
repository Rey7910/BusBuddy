package com.unal.BusBuddyBack.services;


import com.unal.BusBuddyBack.entidades.ReservaView;
import com.unal.BusBuddyBack.repository.ReservaViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReservaViewService implements IReservaViewService{
    @Autowired
    private ReservaViewRepository data;
    @Override
    public List<ReservaView> listarPorUsuario(int idUsuario) {
        return data.findByIdUsuario(idUsuario);
    }

    @Override
    public List<ReservaView> listarPorUsuarioYEstado(int idUsuario, int estado) {
        return data.findByIdUsuarioAndEstado(idUsuario, estado);
    }

    @Override
    public List<ReservaView> listar() {
        return (List<ReservaView>)data.findAll();
    }

    @Override
    public Optional<ReservaView> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public ReservaView save(ReservaView element) {
        return data.save(element);
    }

    @Override
    public void delete(ReservaView element) {
        data.delete(element);
    }

    @Override
    public void deleteId(int id) {
        data.deleteById(id);
    }
}
