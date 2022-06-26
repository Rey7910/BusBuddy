package com.unal.BusBuddyBack.RestControllers;


import com.unal.BusBuddyBack.entidades.Bus;
import com.unal.BusBuddyBack.services.IBusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/bus"})
public class BusRestController {
    @Autowired
    private IBusService service; //
    @GetMapping
    public List<Bus> consultar(){
        return service.listar();
    }
    @PostMapping
    public Bus agregar(@RequestBody Bus bus){
        return service.save(bus);
    }
    @PutMapping
    public Bus editar(@RequestBody Bus bus){
        return service.save(bus);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Bus bus){
        service.delete(bus);
    }
    @DeleteMapping(path="/{id}")
    public void eliminar(@PathVariable("id") int id){
        service.deleteId(id);
    }
}
