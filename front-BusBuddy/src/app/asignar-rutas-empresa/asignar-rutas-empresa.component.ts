import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { ServiceRutasService } from '../Service/service-rutas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { RutaView } from '../Modelo/RutaView';
import { ToastrService } from 'ngx-toastr';
@Component({
  selector: 'app-asignar-rutas-empresa',
  templateUrl: './asignar-rutas-empresa.component.html',
  styleUrls: ['./asignar-rutas-empresa.component.css']
})
export class AsignarRutasEmpresaComponent implements OnInit {
  caja_editar = false;
  constructor(private service:ServiceRutasService,private serviceView:ServiceRutasViewService,private toastr: ToastrService, private router:Router) { }
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
        this.toastr.success("Ruta Creada con exito");
        window.location.reload();
      },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    }else{
      this.toastr.error("Ruta No creada, error con la identificación de la empresa");
    }
    
  }
  Editar(id:number):void{
    sessionStorage.setItem("idAux",id.toString());
  }

  Editar2(){
    this.caja_editar = true; 
  }

  Cancelar(){
    this.caja_editar = false; 
  }
  
}
