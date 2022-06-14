package com.unal.BusBuddyBack.repository;

import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.Empresa;

public interface EmpresaRepository extends CrudRepository<Empresa,Integer> {
    
}
