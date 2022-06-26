package com.unal.BusBuddyBack.repository;

import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
    
}
