package com.unal.BusBuddyBack.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.services.IReservaService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/reserva"})
public class ReservaRestController {
    @Autowired
    private IReservaService service;

    @GetMapping
    public List<Reserva> consultarPorUsuario(int idUsuario){
        return service.listarUsuarioId(idUsuario);
    }

    @PostMapping
    public Reserva agregar(Reserva element){
        return service.save(element);
    }
}
