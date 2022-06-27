package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.repository.ReservaRepository;

@Service
public class ReservaService implements IReservaService{
    @Autowired
    private ReservaRepository data;
    @Override
    public List<Reserva> listar() {
        // TODO Auto-generated method stub
        return (List<Reserva>)data.findAll();
    }

    @Override
    public Optional<Reserva> listarId(int id) {
        return null;
    }

    @Override
    public Reserva save(Reserva element) {
        return data.save(element);
    }

    @Override
    public void delete(Reserva element) {
        data.delete(element);
        
    }

    @Override
    public void deleteId(int id) {
        data.deleteById(id);
        
    }

    @Override
    public List<Reserva> listarPorUsuario(int idUsuario) {
        return data.findByIdUsuario(idUsuario);
    }

    @Override
    public List<Reserva> listarPorUsuarioYEstado(int idUsuario, int estado) {
        return data.findByIdUsuarioAndEstado(idUsuario, estado);
    }

    @Override
    public List<Reserva> listarPorRuta(int idRuta) {
        return data.findByIdRuta(idRuta);
    }

    @Override
    public List<Reserva> listarPorRutaYEstado(int idRuta, int estado) {
        return data.findByIdRutaAndEstado(idRuta, estado);
    }


    
}
