package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.repository.RutaRepository;
import com.unal.BusBuddyBack.services.RutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping()
public class ClienteRestController {
    @Autowired
    private RutaService service;
    @GetMapping()
    public List<Ruta> consultar(){
        return service.listar();
    };
}
