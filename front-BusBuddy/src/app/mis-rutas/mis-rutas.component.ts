import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Reserva } from '../Modelo/Reserva';
import { Ruta } from '../Modelo/Ruta';
import { RutaView } from '../Modelo/RutaView';
import { ServiceReservasService } from '../Service/service-reservas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { ServiceRutasService } from '../Service/service-rutas.service';

@Component({
  selector: 'app-mis-rutas',
  templateUrl: './mis-rutas.component.html',
  styleUrls: ['./mis-rutas.component.css']
})
export class MisRutasComponent implements OnInit {
  visibleValidateTable:boolean;
  constructor(private serviceRutas:ServiceRutasService,private serviceRutasView:ServiceRutasViewService, private serviceReservas:ServiceReservasService, private router:Router,private toastr: ToastrService) { }
  rutas:RutaView[];
  tiquetes:Reserva[];
  tiquetesValidados:Reserva[];
  reservaUpdate:Reserva;
  idRutaValidar:number; 
  selectedRuta:RutaView;
  idConductor:number;
  ngOnInit(): void {
    var rolString=sessionStorage.getItem("rol");
    var idConductorS=sessionStorage.getItem("idConductor");
    if(idConductorS!=null && rolString=="2"){
      this.idConductor=+idConductorS;
      this.visibleValidateTable=false;
      this.serviceRutasView.getRutasConductor(this.idConductor).subscribe(data=>
        this.rutas=data
      );
    }else{
        //Redirigir a error
        console.log("F");
    }
    

    
  }
  getValidarTable(idRuta:number){
    this.visibleValidateTable=true;
    this.serviceReservas.getReservasRutaYEstado(idRuta,0).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
      this.serviceReservas.getReservasRutaYEstado(idRuta,1).subscribe(data=> 
        this.tiquetesValidados=data
      );
      
  }
  selectRuta(ruta:RutaView){
    this.selectedRuta=ruta;
  }

  validarReserva(reserva:Reserva){
    reserva.estado=+1;
    this.serviceReservas.updateReserva(reserva).subscribe(data=>{
      this.toastr.success("Tiquete Validado con exito");
      this.serviceReservas.getReservasRutaYEstado(reserva.idRuta,0).subscribe(data=>
        this.tiquetes=data
      );
      this.serviceReservas.getReservasRutaYEstado(reserva.idRuta,1).subscribe(data=> 
        this.tiquetesValidados=data
      );
    },err =>this.toastr.error("Persona no creada, ha ocurrido un error"));
    
  }
  rechazarReservas(){ //Rechazar las que están en estado 0 de la ruta cuando esta esté en curso 
  }
  changeState(state:String,ruta:RutaView){
    if(ruta!=null ){
      this.serviceRutas.updateEstado(state,ruta.idRuta).subscribe(data=>
        {
          this.toastr.success("Cambio de estado realizado con exito");
          window.location.reload();
        },err=>
          this.toastr.error("Cambio de estado no realizado ")
        );
    }else{
      this.toastr.info("Debes seleccionar una ruta.")
    }
    
  }
  cerrarSesion(){
    sessionStorage.clear();
  }
}
