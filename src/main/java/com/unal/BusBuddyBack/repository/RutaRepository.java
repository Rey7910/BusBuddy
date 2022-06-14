package com.unal.BusBuddyBack.repository;

import com.unal.BusBuddyBack.entidades.Ruta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface RutaRepository extends Repository<Ruta,Integer> {
    List<Ruta> listAll();
    Ruta findOne(int id);
    Ruta save(Ruta r);
    void delete(Ruta object);
}
