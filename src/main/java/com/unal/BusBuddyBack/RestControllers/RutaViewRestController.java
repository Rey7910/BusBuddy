package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;
import com.unal.BusBuddyBack.services.IRutaViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/rutasView"})
public class RutaViewRestController {
    @Autowired
    private IRutaViewService service; //
    @GetMapping
    public List<RutaView> consultar(){
        return service.listar();
    }
    @GetMapping(path="/conductor={id}")
    public List<RutaView> consultarPorConductor(@PathVariable("id") int id){
        System.out.println("AAAAAAAA"+id);
        return service.listarConductorId(id);
    }
}
