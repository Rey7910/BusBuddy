package com.unal.BusBuddyBack.RestControllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.unal.BusBuddyBack.services.IAdminEmpresaService;
import com.unal.BusBuddyBack.entidades.AdministradorEmpresa;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/adminEmpresa"})
public class AdminEmpresaRestController {
    @Autowired
    private IAdminEmpresaService service; //
    @GetMapping
    public List<AdministradorEmpresa> consultar(){
        return service.listar();
    }
    @PostMapping
    public AdministradorEmpresa agregar(@RequestBody AdministradorEmpresa admin){
        return service.save(admin);
    }
    @PutMapping
    public AdministradorEmpresa editar(@RequestBody AdministradorEmpresa admin){
        return service.save(admin);
    }
    @DeleteMapping
    public void eliminar(@RequestBody AdministradorEmpresa admin){
        service.delete(admin);
    }
    @DeleteMapping(path="/{id}")
    public void eliminar(@PathVariable("id") int id){
        service.deleteId(id);
    }
}
