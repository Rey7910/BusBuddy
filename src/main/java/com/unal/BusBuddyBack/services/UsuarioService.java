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
        return (List<Usuario>)dataURepository.findAll();
    }

    @Override
    public Optional<Usuario> listarId(int id) {
        return dataURepository.findById(id);
    }

    @Override
    public Usuario save(Usuario element) { 
        return dataURepository.save(element);
    }

    @Override
    public void delete(Usuario element) {
        dataURepository.delete(element);
        
    }

    @Override
    public void deleteId(int id) {

    }

}
