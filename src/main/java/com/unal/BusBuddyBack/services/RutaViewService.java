package com.unal.BusBuddyBack.services;


import com.unal.BusBuddyBack.entidades.RutaView;
import com.unal.BusBuddyBack.repository.RutaViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RutaViewService implements IRutaViewService{
    @Autowired
    private RutaViewRepository data; //
    @Override
    public List<RutaView> listar() {
        return (List<RutaView>)data.findAll();

    }


    @Override
    public Optional<RutaView> listarId(int id) {
        return Optional.empty();
    }



    @Override
    public RutaView save(RutaView element) {
        return null;
    }

    @Override
    public void delete(RutaView ruta) {

    }

    @Override
    public void deleteId(int id) {

    }
}
