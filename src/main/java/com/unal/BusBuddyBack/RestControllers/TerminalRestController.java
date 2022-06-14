package com.unal.BusBuddyBack.RestControllers;


import com.unal.BusBuddyBack.entidades.Terminal;
import com.unal.BusBuddyBack.services.IRutaService;
import com.unal.BusBuddyBack.services.ITerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/terminales"})
public class TerminalRestController {
    @Autowired
    private ITerminalService service;

    @GetMapping
    public List<Terminal> consultar(){
        return service.listar();
    }
    @GetMapping(path={"/name/{id}"})
    public String getNombre(@PathVariable("id") int id){
        Terminal t=service.listarId(id);

        return t.getCiudad();
    }
    @GetMapping(path={"/{id}"}) //Referencia a consulta
    public Terminal getById(@PathVariable("id") int id){
        return service.listarId(id );
    }
   /* @PutMapping(path={"/{id}"}) //Referencia a actualizacion
    public Terminal editar(@RequestBody Terminal t,@PathVariable("id") int id){
        t.setId(id);
        return service.save(t);
    }*/
    @PostMapping
    public Terminal agregar(@RequestBody Terminal terminal){
        return service.save(terminal);
    }
}
