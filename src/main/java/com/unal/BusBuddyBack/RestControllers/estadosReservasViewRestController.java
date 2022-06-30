package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.EstadoReservaView;
import com.unal.BusBuddyBack.services.IEstadoReservaViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/estadoReservasView"})
public class estadosReservasViewRestController {
    @Autowired
    private IEstadoReservaViewService serviceEstadoReservaView;
    @GetMapping()
    public List<EstadoReservaView> estadoReservas(){
        return serviceEstadoReservaView.listar();
    }
}
