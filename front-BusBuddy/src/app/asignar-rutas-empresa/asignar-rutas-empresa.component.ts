import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { ServiceRutasService } from '../Service/service-rutas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { RutaView } from '../Modelo/RutaView';
import { ToastrService } from 'ngx-toastr';
import { Terminal } from '../Modelo/Terminal';
import { ServiceTerminalService } from '../Service/service-terminal.service';
import { ServiceConductorService } from '../Service/service-conductor.service';
import { Conductor } from '../Modelo/Conductor';
import { ServiceBusService } from '../Service/service-bus.service';
import { Bus } from '../Modelo/Bus';
import { ServiceConductorViewService } from '../Service/service-conductor-view.service';
import { ConductorView } from '../Modelo/ConductorView';
@Component({
  selector: 'app-asignar-rutas-empresa',
  templateUrl: './asignar-rutas-empresa.component.html',
  styleUrls: ['./asignar-rutas-empresa.component.css']
})
export class AsignarRutasEmpresaComponent implements OnInit {
  time = {hour: 13, minute: 30};
  caja_editar = false;
  constructor(private service:ServiceRutasService,private serviceView:ServiceRutasViewService,private serviceBus:ServiceBusService,private serviceTerminal:ServiceTerminalService,private serviceConductorView:ServiceConductorViewService,private toastr: ToastrService, private router:Router) { }
  rutas:RutaView[];
  terminales:Terminal[];
  conductores:ConductorView[];
  buses:Bus[];
  newRuta=new Ruta();
  idEmpresa:number;
  ngOnInit(): void {

    
    var idEmpresaS=sessionStorage.getItem("idEmpresa");
    if(idEmpresaS!=null){
      this.idEmpresa=+idEmpresaS;
      this.serviceView.getRutas().subscribe(data=>{
        this.rutas=data;
      }) ;
      this.serviceTerminal.getTerminales().subscribe(data=>{
        this.terminales=data;
      });
      this.serviceConductorView.getConductores().subscribe(data=>{
        this.conductores=data;
      });
      this.serviceBus.getBuses().subscribe(data=>{
        this.buses=data;
      });
    }else{
      //Enviar a pagina error
      console.log("F");
    }
    
    //sessionStorage.setItem("idEmpresa",'1');
  }
  Crear(ruta:Ruta):void{
    if(ruta.destino!=ruta.origen){
        ruta.idEmpresa=this.idEmpresa;
        this.service.crearRuta(ruta).subscribe(data=>{
          this.toastr.success("Ruta Creada con exito");
          window.location.reload();
        },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
      this.serviceView.getRutas().
      subscribe(data=>{
        this.rutas=data;
      }) ;
    }else{
      this.toastr.error("Selecciona un destino distinto al origen por favor");
    }
    
  }
  Editar(ruta:Ruta):void{
    
      ruta.idEmpresa=this.idEmpresa;
      this.service.crearRuta(ruta).subscribe(data=>{
        this.toastr.success("Ruta Editada con exito");
        window.location.reload();
      },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
    this.serviceView.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
  }

  Editar2(id:number){
    this.newRuta.idRuta=id;
    this.caja_editar = true; 
  }

  Cancelar(){
    this.caja_editar = false; 
  }
  Eliminar(idRuta:number){
    if(confirm("¿Seguro quieres eliminar la ruta?")) {
        this.service.deleteRutaId(idRuta).subscribe(data=>{
          this.toastr.success("Ruta Eliminada con exito");
          window.location.reload();
        },err =>this.toastr.error("Ha ocurrido un error al intentar eliminar"));
      this.serviceView.getRutas().
      subscribe(data=>{
        this.rutas=data;
      }) ;
    }
    
  }
  cerrarSesion(){
    sessionStorage.clear();
  }
  
}
