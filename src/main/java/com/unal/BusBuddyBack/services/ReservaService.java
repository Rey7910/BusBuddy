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
        return null;
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
    public List<Reserva> listarUsuarioId(int id) {
        return (List<Reserva>) data.findByIdUsuario(id);
    }
    
}
