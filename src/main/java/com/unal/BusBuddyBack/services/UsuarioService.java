package com.unal.BusBuddyBack.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Usuario;
import com.unal.BusBuddyBack.repository.UsuarioRepository;

@Service
public class UsuarioService implements IUsuarioService {

    @Autowired
    private UsuarioRepository dataURepository; //
    @Override
    public List<Usuario> listar() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Usuario> listarId(int id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Usuario save(Usuario element) {
        element.setRol(0); //hacerlo cliente
        return dataURepository.save(element);
    }

    @Override
    public void delete(int id) {
        dataURepository.deleteById(id);
        
    }
    
}
