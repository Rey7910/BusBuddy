package com.unal.BusBuddyBack.RestControllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unal.BusBuddyBack.services.EmpresaService;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/empresa"})
public class EmpresaRestController {
    @Autowired
    EmpresaService servEmpresa;

    
    
}
