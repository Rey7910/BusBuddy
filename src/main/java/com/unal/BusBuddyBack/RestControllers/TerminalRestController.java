package com.unal.BusBuddyBack.RestControllers;


import com.unal.BusBuddyBack.entidades.Terminal;
import com.unal.BusBuddyBack.services.IRutaService;
import com.unal.BusBuddyBack.services.ITerminalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

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
    @GetMapping(path={"/{id}"}) //Referencia a consulta
    public Terminal getById(@PathVariable("id") int id){
        Optional<Terminal> a=service.listarId(id );
        if(a.isPresent()){
            System.out.println("SI Hay un Terminal xdd");
            return a.get();
        }
        return new Terminal();
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
