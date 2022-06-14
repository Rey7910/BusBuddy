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
        System.out.println("AAOOAA");
        return service.listar();
    }
    @GetMapping
    public Terminal getById(int id){
        return null;
    }
    @PostMapping
    public Terminal agregar(@RequestBody Terminal terminal){
        return service.save(terminal);
    }
}
