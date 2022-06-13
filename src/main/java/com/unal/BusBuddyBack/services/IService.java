package com.unal.BusBuddyBack.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    public List<T> listar();
    public Optional<T> listarId(int id);
    public boolean save(T element);
    public void delete(int id);
}
