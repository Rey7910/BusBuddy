package com.unal.BusBuddyBack.repository;


import org.springframework.data.repository.CrudRepository;

import com.unal.BusBuddyBack.entidades.Bus;

public interface BusRepository extends CrudRepository<Bus,Integer>  {
    
}
