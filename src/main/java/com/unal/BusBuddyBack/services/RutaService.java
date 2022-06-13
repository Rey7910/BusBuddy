package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Ruta;
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
    public boolean save(Ruta element) {
        boolean re=false;
        Ruta ruta=data.save(element);
        if(!ruta.equals(null)){
            re=true;
        }
        return re;
    }

    @Override
    public void delete(int id) {
        data.deleteById(id);
    }
}
