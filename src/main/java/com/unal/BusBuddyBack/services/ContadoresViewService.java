package com.unal.BusBuddyBack.services;

import com.unal.BusBuddyBack.entidades.ContadoresView;
import com.unal.BusBuddyBack.repository.ContadoresViewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class ContadoresViewService implements IContadoresViewService{
    @Autowired
    private ContadoresViewRepository data;
    @Override
    public List<ContadoresView> listar() {
        return (List<ContadoresView>)data.findAll();
    }

    @Override
    public Optional<ContadoresView> listarId(int id) {
        return Optional.empty();
    }

    @Override
    public ContadoresView save(ContadoresView element) {
        return null;
    }

    @Override
    public void delete(ContadoresView element) {

    }

    @Override
    public void deleteId(int id) {

    }
}
