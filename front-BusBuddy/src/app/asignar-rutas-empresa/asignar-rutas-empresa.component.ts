import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { ServiceRutasService } from '../Service/service-rutas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { RutaView } from '../Modelo/RutaView';
import { ToastrService } from 'ngx-toastr';
import { Terminal } from '../Modelo/Terminal';
import { ServiceTerminalService } from '../Service/service-terminal.service';
@Component({
  selector: 'app-asignar-rutas-empresa',
  templateUrl: './asignar-rutas-empresa.component.html',
  styleUrls: ['./asignar-rutas-empresa.component.css']
})
export class AsignarRutasEmpresaComponent implements OnInit {
  caja_editar = false;
  constructor(private service:ServiceRutasService,private serviceView:ServiceRutasViewService,private serviceTerminal:ServiceTerminalService,private toastr: ToastrService, private router:Router) { }
  rutas:RutaView[];
  terminales:Terminal[];
  newRuta=new Ruta();
  ngOnInit(): void {
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    this.serviceTerminal.getTerminales().subscribe(data=>{
      this.terminales=data;
    });
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
  Editar(ruta:Ruta):void{
    var idE=sessionStorage.getItem("idEmpresa");
    if(idE!=null){
      ruta.idEmpresa=+idE;
      this.service.crearRuta(ruta).subscribe(data=>{
        this.toastr.success("Ruta Editada con exito");
        window.location.reload();
      },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    }else{
      this.toastr.error("Ruta No Editada, error con la identificación de la empresa");
    }
  }

  Editar2(id:number){
    this.newRuta.idRuta=id;
    this.caja_editar = true; 
  }

  Cancelar(){
    this.caja_editar = false; 
  }
  Eliminar(idRuta:number){
    var idE=sessionStorage.getItem("idEmpresa");
    if(idE!=null){
      this.service.deleteRutaId(idRuta).subscribe(data=>{
        this.toastr.success("Ruta Eliminada con exito");
        window.location.reload();
      },err =>this.toastr.error("Ha ocurrido un error al intentar eliminar"));
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    }else{
      this.toastr.error("Ruta No Eliminada, error con la identificación de la empresa");
    }
  }
  
}
