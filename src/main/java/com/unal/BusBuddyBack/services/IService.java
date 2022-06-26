package com.unal.BusBuddyBack.services;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface IService<T> {
    public List<T> listar();
    public Optional<T> listarId(int id); //
    public T save(T element); //
    public void delete(T element);
}
