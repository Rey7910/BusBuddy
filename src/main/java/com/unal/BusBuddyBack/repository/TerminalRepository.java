package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Terminal;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface TerminalRepository extends Repository<Terminal,Integer> {
    List<Terminal> listAll();
    Terminal findOne(int id);
    Terminal save(Terminal r);
    void delete(Terminal object);
}
