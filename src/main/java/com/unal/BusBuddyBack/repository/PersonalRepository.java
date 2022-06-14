package com.unal.BusBuddyBack.repository;

import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.Personal;

public interface PersonalRepository extends CrudRepository<Personal,Integer> {
    
}
