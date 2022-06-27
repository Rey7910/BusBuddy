package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.repository.ReservaRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ReservaService implements IReservaService{

    @Autowired
    private ReservaRespository data;

    @Override
    public List<Reserva> listar() {
        return (List<Reserva>)data.findAll();
    }

    @Override
    public Optional<Reserva> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public Reserva save(Reserva element) {
        return data.save(element);
    }

    @Override
    public void delete(Reserva element) {

    }

    @Override
    public void deleteId(int id) {

    }

    @Override
    public List<Reserva> listarPorUsuarioYEstado(int idUsuario, int estado) {
        return (List<Reserva>) data.findByIdUsuarioAndEstado(idUsuario,estado);
    }
    @Override
    public List<Reserva> listarPorUsuario(int idUsuario) {
        return (List<Reserva>) data.findByIdUsuario(idUsuario);
    }

    @Override
    public List<Reserva> listarPorRuta(int idRuta) {
        return (List<Reserva>) data.findByIdRuta(idRuta);
    }

    @Override
    public List<Reserva> listarPorRutaYEstado(int idRuta, int estado) {
        return (List<Reserva>) data.findByIdRutaAndEstado(idRuta,estado);
    }
}
