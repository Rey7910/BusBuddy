package com.unal.BusBuddyBack.RestControllers;

import com.unal.BusBuddyBack.entidades.Ruta;
import com.unal.BusBuddyBack.entidades.RutaView;
import com.unal.BusBuddyBack.services.IRutaViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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
    @GetMapping(path="/conductor={id}")
    public List<RutaView> consultarPorConductor(@PathVariable("id") int id){
        return service.listarConductorId(id);
    }
    @GetMapping(path="/consultaFiltradao={origen}d={destino}f={fecha}min={min}max={max}")
    public List<RutaView> consultarPrueba(
            @PathVariable("origen") int origen, @PathVariable( "destino") int destino, @PathVariable( "fecha") @DateTimeFormat(pattern = "yyyy-MM-dd") Date fechaSalida, @PathVariable( "min")int precioMin, @PathVariable( "max") int precioMax
    ){
        return service.consultaFiltrada( origen,  destino,  fechaSalida,  precioMin,  precioMax);
    }
}
