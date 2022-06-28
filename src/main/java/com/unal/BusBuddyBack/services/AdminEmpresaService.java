package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.unal.BusBuddyBack.entidades.AdministradorEmpresa;
import com.unal.BusBuddyBack.repository.AdminEmpresaRepository;

public class AdminEmpresaService implements IAdminEmpresaService {

    @Autowired
    private AdminEmpresaRepository data;

    @Override
    public List<AdministradorEmpresa> listar() {
        return (List<AdministradorEmpresa>) data.findAll();
    }

    @Override
    public Optional<AdministradorEmpresa> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public AdministradorEmpresa save(AdministradorEmpresa element) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public void delete(AdministradorEmpresa element) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteId(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
