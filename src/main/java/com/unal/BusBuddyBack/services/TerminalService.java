package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Terminal;
import com.unal.BusBuddyBack.repository.TerminalRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TerminalService implements ITerminalService{
    @Autowired
    TerminalRepository data;
    @Override
    public List<Terminal> listar() {
        return (List<Terminal>) data.findAll();
    }

    @Override
    public Optional listarId(int id) {
        return Optional.empty();
    }

    @Override
    public boolean save(Object element) {
        return false;
    }

    @Override
    public void delete(int id) {

    }
}
