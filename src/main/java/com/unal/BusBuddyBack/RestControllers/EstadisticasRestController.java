package com.unal.BusBuddyBack.RestControllers;


import com.unal.BusBuddyBack.entidades.ContadoresView;
import com.unal.BusBuddyBack.services.IContadoresViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/estadisticas"})
public class EstadisticasRestController {
    @Autowired
    private IContadoresViewService serviceContadoresView;
    @GetMapping("/contadores_estadoRutas")
    public List<ContadoresView> contadores(){
        return serviceContadoresView.listar();
    }
}
