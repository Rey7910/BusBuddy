package com.unal.BusBuddyBack.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.services.IConductorService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/conductor"})
public class ConductorRestController {

    @Autowired
    private IConductorService servConductor; //
    @GetMapping
    public List<Conductor> consultar(){
        return servConductor.listar();
    }
    @PostMapping
    public Conductor agregar(@RequestBody Conductor cond){
        return servConductor.save(cond);
    }
    
}
