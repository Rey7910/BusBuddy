package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.repository.ConductorRepository;

@Service
public class ConductorService implements IConductorService{
    @Autowired
    private ConductorRepository data; //

    public List<Conductor> listar() {
        return (List<Conductor>)data.findAll();
    }

    public Optional<Conductor> listarId(int id) {

        return data.findById(id);
    }

    public Conductor save(Conductor element){
        return data.save(element);
    }

    public void delete(int id) {
        data.deleteById(id);
    }
}
