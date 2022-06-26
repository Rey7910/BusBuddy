package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.Bus;
import com.unal.BusBuddyBack.repository.BusRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BusService implements IBusService{
    @Autowired
    private BusRepository data;

    @Override
    public List<Bus> listar() {
        return (List<Bus>) data.findAll();
    }

    @Override
    public Optional<Bus> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public Bus save(Bus element) {
        return null;
    }

    @Override
    public void delete(Bus element) {

    }

    @Override
    public void deleteId(int id) {

    }
}
