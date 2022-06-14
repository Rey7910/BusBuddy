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
    public Ruta listarId(int id) {
        Optional<Ruta> a=data.findById(id);
        if(a.isPresent()){
            System.out.println("Si hay una ruta con el id xd");
            return a.get();
        }System.out.println("NO hay una ruta con el id :c");
        return null;
    }


    @Override
    public Ruta save(Ruta ruta) {
        return data.save(ruta);
    }

    @Override
    public void delete(int id) {

    }


}
