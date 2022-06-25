package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.RutaView;
import com.unal.BusBuddyBack.services.IRutaViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
