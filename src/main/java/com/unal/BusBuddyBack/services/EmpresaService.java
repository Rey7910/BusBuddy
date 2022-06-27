package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Empresa;
import com.unal.BusBuddyBack.repository.EmpresaRepository;

@Service
public class EmpresaService implements IEmpresaService{

    @Autowired
    private EmpresaRepository repEmpresa;

    @Override
    public List<Empresa> listar() {
        return (List<Empresa>) repEmpresa.findAll();
    }

    @Override
    public Optional<Empresa> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Empresa save(Empresa element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(Empresa element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteId(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
