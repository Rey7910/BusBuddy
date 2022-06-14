package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Terminal;
import com.unal.BusBuddyBack.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class TerminalService implements ITerminalService{
    @Autowired
    private TerminalRepository data;

    @Override
    public List<Terminal> listar() {
        return (List<Terminal>)data.findAll();
    }

    @Override
    public Terminal listarId(int id) {
        Optional<Terminal> a=data.findById(id);
        if(a.isPresent()){
            System.out.println("Si hay un terminal con el id xd");
            return a.get();
        }System.out.println("NO hay un terminal con el id :c");
        return null;

    }


    @Override
    public Terminal save(Terminal element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}

