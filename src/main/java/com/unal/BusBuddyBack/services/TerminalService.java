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
        return null;
    }

    @Override
    public Optional<Terminal> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public Terminal save(Terminal element) {
        return null;
    }

    @Override
    public void delete(int id) {

    }
}
}
