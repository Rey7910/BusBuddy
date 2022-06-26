package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.ConductorView;
import com.unal.BusBuddyBack.services.IConductorViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/conductor_info"})
public class ConductorViewRestController {
    @Autowired
    private IConductorViewService service; //
    @GetMapping
    public List<ConductorView> consultar(){
        return service.listar();
    }
}
