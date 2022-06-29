package com.unal.BusBuddyBack.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping(path ={"/{id}"})
    public Personal editar(@RequestBody Personal personal, @PathVariable("id") int id){
        personal.setIdpersonal(id);
        return servPersonal.save(personal);
    }

    @DeleteMapping
    public void eliminar(@RequestBody Personal personal){
        servPersonal.delete(personal);
    }
    @DeleteMapping(path="/{id}")
    public void eliminar(@PathVariable("id") int id){
        servPersonal.deleteId(id);
    }


}
