package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;
import com.unal.BusBuddyBack.services.IRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/rutas"})
public class RutaRestController {
    @Autowired
    private IRutaService service; //
    @GetMapping
    public List<Ruta> consultar(){
        return service.listar();
    }
    @GetMapping(path="/conductor={id}")
    public List<Ruta> consultarPorConductor(@PathVariable("id") int id){
        return service.listarConductorId(id);
    }

    @PostMapping
    public Ruta agregar(@RequestBody Ruta ruta){
        return service.save(ruta);
    }
    @PutMapping
    public Ruta editar(@RequestBody Ruta r){
        return service.save(r);
    }
    @DeleteMapping
    public void eliminar(@RequestBody Ruta r){
        service.delete(r);
    }
    @DeleteMapping(path="/{id}")
    public void eliminar(@PathVariable("id") int id){
        service.deleteId(id);
    }
    @PutMapping(path="/{id}state={state}")
    public void setState(@PathVariable("state") String state, @PathVariable("id") int id){
        System.out.println("Estado "+state+" Id: "+id);
         service.setState(state,id);
    }

}
