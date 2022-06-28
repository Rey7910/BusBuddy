package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Reserva;
import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.services.IReservaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/reservas"})
public class ReservaRestController {
    @Autowired
    private IReservaService service;
    @PostMapping
    public Reserva agregar(@RequestBody Reserva ruta){
        return service.save(ruta);
    }
    @GetMapping
    public List<Reserva> consultar(){
        return service.listar();
    }
    @GetMapping("/user={id}")
    public List<Reserva> consultarPorUsuario(@PathVariable("id") int idUser){
        return service.listarPorUsuario(idUser);
    }
    @GetMapping("/user={id}/estado={c}")
    public List<Reserva> consultarPorUsuarioYEstado(@PathVariable("id") int idUser,@PathVariable("c") int estado){
        return service.listarPorUsuarioYEstado(idUser,estado);
    }
    @GetMapping("/rute={id}")
    public List<Reserva> consultarPorRuta(@PathVariable("id") int idRuta){
        return service.listarPorRuta(idRuta);
    }
    @GetMapping("/rute={id}/estado={x}")
    public List<Reserva> consultarPorRutaYEstado(@PathVariable("id") int idRuta,@PathVariable("x") int estado){
        return service.listarPorRutaYEstado(idRuta,estado);
    }
    @PutMapping
    public Reserva editar(@RequestBody Reserva r){
        return service.save(r);
    }

}
