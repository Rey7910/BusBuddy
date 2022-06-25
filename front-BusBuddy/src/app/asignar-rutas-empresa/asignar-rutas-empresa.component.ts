import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { ServiceRutasService } from '../Service/service-rutas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { RutaView } from '../Modelo/RutaView';
@Component({
  selector: 'app-asignar-rutas-empresa',
  templateUrl: './asignar-rutas-empresa.component.html',
  styleUrls: ['./asignar-rutas-empresa.component.css']
})
export class AsignarRutasEmpresaComponent implements OnInit {

  constructor(private service:ServiceRutasService,private serviceView:ServiceRutasViewService, private router:Router) { }
  rutas:RutaView[]
  newRuta=new Ruta();
  ngOnInit(): void {
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    sessionStorage.setItem("idEmpresa",'1');
  }
  Crear(ruta:Ruta):void{
    
    
    var idE=sessionStorage.getItem("idEmpresa");
    if(idE!=null){
      ruta.idEmpresa=+idE;
      this.service.crearRuta(ruta).subscribe(data=>{
        window.alert("Ruta Creada con exito");
        window.location.reload();
      },err =>window.alert("Verifica datos, ha ocurrido un error"));
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    }else{
      window.alert("Ruta No creada, error con la identificación de la empresa");
    }
    
  }
  
}
