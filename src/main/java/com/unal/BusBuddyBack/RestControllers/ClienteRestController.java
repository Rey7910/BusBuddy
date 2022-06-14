package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.services.IConductorService;
import com.unal.BusBuddyBack.services.IRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController

public class ClienteRestController {
    @Autowired
    private IRutaService servRuta; //

    @RequestMapping({"/rutas"})
    @GetMapping
    public List<Ruta> consultar(){
        System.out.println("AAOOAA");
        return servRuta.listar();
    }
    private IConductorService servConductor; 

    @PostMapping
    public boolean agregar(@RequestBody Conductor cond){
        System.out.println("conductor");
        return servConductor.save(cond);
    }
}
