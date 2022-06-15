package com.unal.BusBuddyBack.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Usuario;
import com.unal.BusBuddyBack.repository.UsuarioRepository;
import org.springframework.stereotype.Service;

@Service

public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository data; //
    @Override
    public List<Usuario> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario save(Usuario element) {
        element.setRol(0); //hacerlo cliente
        return data.save(element);
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        
    }
    
}
