package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.entidades.ConductorView;
import com.unal.BusBuddyBack.repository.ConductorViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ConductorViewService implements IConductorViewService{
    @Autowired
    private ConductorViewRepository data;
    @Override
    public List<ConductorView> listar() {
        return (List<ConductorView>) data.findAll();
    }

    @Override
    public Optional<ConductorView> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public ConductorView save(ConductorView element) {
        return null;
    }

    @Override
    public void delete(ConductorView element) {

    }

    @Override
    public void deleteId(int id) {

    }
}
