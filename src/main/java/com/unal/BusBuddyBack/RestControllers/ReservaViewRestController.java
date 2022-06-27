package com.unal.BusBuddyBack.RestControllers;


import com.unal.BusBuddyBack.entidades.ReservaView;
import com.unal.BusBuddyBack.services.IReservaViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/reservasView"})
public class ReservaViewRestController {
    @Autowired
    private IReservaViewService service;
    @GetMapping
    public List<ReservaView> consultar(){

        return service.listar();
    }
    @GetMapping("/user={id}")
    public List<ReservaView> consultarPorUsuario(@PathVariable("id") int idUser){
        return service.listarPorUsuario(idUser);
    }
    @GetMapping("/user={id}/estado={c}")
    public List<ReservaView> consultarPorUsuarioYEstado(@PathVariable("id") int idUser,@PathVariable("c") int estado){
        return service.listarPorUsuarioYEstado(idUser,estado);
    }

    @PutMapping
    public ReservaView editar(@RequestBody ReservaView r){
        return service.save(r);
    }
}
