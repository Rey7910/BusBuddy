package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Usuario;
import com.unal.BusBuddyBack.services.IUsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@CrossOrigin(origins = "http://localhost:4200",maxAge = 3600)
@RestController
@RequestMapping({"/usuario"})
public class UsuarioRestController {
    @Autowired
    private IUsuarioService servUsuario; //

    @GetMapping
    public List<Usuario> consultar(){
        return servUsuario.listar();
    }

    @PostMapping
    public Usuario agregar(@RequestBody Usuario usuario){
        return servUsuario.save(usuario);
    }    
}
