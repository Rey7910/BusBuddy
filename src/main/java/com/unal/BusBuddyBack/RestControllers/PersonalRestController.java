package com.unal.BusBuddyBack.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.unal.BusBuddyBack.entidades.Personal;
import com.unal.BusBuddyBack.services.PersonalService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/personal"})
public class PersonalRestController {
    @Autowired
    private PersonalService servPersonal;

    @GetMapping
    public List<Personal> consultar(){
        return servPersonal.listar();
    }

    @PostMapping
    public Personal agregar(@RequestBody Personal pers){
        return servPersonal.save(pers);
    }


}
