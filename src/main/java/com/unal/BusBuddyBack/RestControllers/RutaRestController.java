package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.services.IRutaService;
import org.springframework.beans.factory.annotation.Autowired;
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
        System.out.println("AAOOAA");
        return service.listar();
    }
    @PostMapping
    public Ruta agregar(@RequestBody Ruta ruta){
        return service.save(ruta);
    }
}
