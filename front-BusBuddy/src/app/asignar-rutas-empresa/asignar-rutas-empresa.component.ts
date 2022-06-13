import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { ServiceRutasService } from '../Service/service-rutas.service';
@Component({
  selector: 'app-asignar-rutas-empresa',
  templateUrl: './asignar-rutas-empresa.component.html',
  styleUrls: ['./asignar-rutas-empresa.component.css']
})
export class AsignarRutasEmpresaComponent implements OnInit {

  constructor(private service:ServiceRutasService, private router:Router) { }
  rutas:Ruta[]
  newRuta=new Ruta();
  ngOnInit(): void {
    this.service.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
  }
  Crear(ruta:Ruta):void{
    this.service.crearRuta(ruta)
    .subscribe(data=>{
      window.alert("Ruta Creada con exito");
      window.location.reload();
    });
    this.service.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
  }
  
}
