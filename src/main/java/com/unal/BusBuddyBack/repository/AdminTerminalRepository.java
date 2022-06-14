package com.unal.BusBuddyBack.repository;

import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.AdministradorTerminal;

public interface AdminTerminalRepository extends CrudRepository<AdministradorTerminal,Integer> {
    
}
