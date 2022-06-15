package com.unal.BusBuddyBack.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.services.IConductorService;

/*@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/conductor"})*/
public class ConductorRestController {

    @Autowired
    private IConductorService servConductor; //
    
    @PostMapping
    public Conductor agregar(@RequestBody Conductor cond){
        System.out.println("conductor");
        return servConductor.save(cond);
    }
    
}
