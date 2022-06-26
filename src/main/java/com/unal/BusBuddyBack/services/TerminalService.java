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
    public Optional<Terminal> listarId(int id) { //a
        return data.findById(id);


    }

    @Override
    public Terminal save(Terminal element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Terminal id) {

    }

    
}

