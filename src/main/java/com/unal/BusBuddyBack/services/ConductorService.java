package com.unal.BusBuddyBack.services;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.unal.BusBuddyBack.entidades.Conductor;
import com.unal.BusBuddyBack.entidades.Usuario;
import com.unal.BusBuddyBack.repository.ConductorRepository;
import com.unal.BusBuddyBack.repository.UsuarioRepository;

@Service
public class ConductorService {
    @Autowired
    private ConductorRepository data; //
    private UsuarioRepository dataUsuario;
    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");


    public Usuario toUsuario(Conductor conductor) throws ParseException{
        Usuario usuario = new Usuario(conductor.getIdusuario(),"","","","","",3 ,formato.parse("01/01/2000"));
        
        return usuario;
    }

    public List<Conductor> listar() {
        return (List<Conductor>)data.findAll();
    }

    public Optional<Conductor> listarId(int id) {

        return data.findById(id);
    }

    public boolean save(Conductor element) throws ParseException {
        boolean re=false;
        Conductor conductor=data.save(element);
        Usuario usuario=dataUsuario.save(toUsuario(element));
        if(!conductor.equals(null) & !usuario.equals(null)){
            re=true;
        }
        return re;
    }

    public void delete(int id) {
        data.deleteById(id);
    }
}
