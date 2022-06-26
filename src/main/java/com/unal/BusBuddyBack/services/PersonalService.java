package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Personal;
import com.unal.BusBuddyBack.repository.PersonalRepository;

@Service
public class PersonalService implements IPersonalService{

    @Autowired
    private PersonalRepository dataPersonal;

    @Override
    public List<Personal> listar() {
        return (List<Personal>) dataPersonal.findAll();
    }

    @Override
    public Optional<Personal> listarId(int id) {
        return dataPersonal.findById(id);
    }

    @Override
    public Personal save(Personal element) {
        return dataPersonal.save(element);
    }

    @Override
    public void delete(Personal id) {
        dataPersonal.delete(id);
    }
    
}
