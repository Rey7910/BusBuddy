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
    private PersonalRepository data;

    @Override
    public List<Personal> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Personal listarId(int id) {
        Optional<Personal> personal=data.findById(id);
        if(personal.isPresent()){
            System.out.println("Si hay una ruta con el id ");
            return personal.get();
        }System.out.println("NO hay una ruta con el id :c");
        return null;
    }

    @Override
    public Personal save(Personal element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
