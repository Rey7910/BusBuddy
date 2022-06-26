package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.Terminal;
import com.unal.BusBuddyBack.repository.RutaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class RutaService  implements IRutaService {
    @Autowired
    private RutaRepository data; //
    @Override
    public List<Ruta> listar() {
        return (List<Ruta>)data.findAll();
    }

    @Override
    public Optional<Ruta> listarId(int id) {
        return data.findById(id);
    }


    @Override
    public Ruta save(Ruta ruta) {
        return data.save(ruta);
    }

    @Override
    public void delete(int id) {
        //data.delete(ruta);
    }


}
