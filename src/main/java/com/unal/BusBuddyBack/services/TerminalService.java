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
        return data.findOne(id);
    }

    @Override
    public Terminal save(Terminal element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}

