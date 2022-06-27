import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Reserva } from '../Modelo/Reserva';
import { Ruta } from '../Modelo/Ruta';
import { RutaView } from '../Modelo/RutaView';
import { ServiceReservasService } from '../Service/service-reservas.service';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';

@Component({
  selector: 'app-mis-rutas',
  templateUrl: './mis-rutas.component.html',
  styleUrls: ['./mis-rutas.component.css']
})
export class MisRutasComponent implements OnInit {
  visibleValidateTable:boolean;
  constructor(private serviceRutasView:ServiceRutasViewService, private serviceReservas:ServiceReservasService, private router:Router,private toastr: ToastrService) { }
  rutas:RutaView[];
  tiquetes:Reserva[];
  reservaUpdate:Reserva;
  idRutaValidar:number; 
  ngOnInit(): void {
    this.visibleValidateTable=true;
    this.serviceRutasView.getRutasConductor(1).subscribe(data=>
      this.rutas=data
    );
    console.log(this.rutas);
  }
  getValidarTable(idRuta:number){
    this.visibleValidateTable=true;
    this.serviceReservas.getReservasRutaYEstado(idRuta,0).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
  }
  validarReserva(reserva:Reserva){
    reserva.estado=+1;
    this.serviceReservas.updateReserva(reserva).subscribe(data=>{
      this.toastr.success("Tiquete Validado con exito");
      this.serviceReservas.getReservasRutaYEstado(reserva.idRuta,0).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
    },err =>this.toastr.error("Tiquete no validado, ha ocurrido un error"));
    
  }
  rechazarReservas(){ //Rechazar las que están en estado 0 de la ruta cuando esta esté en curso 
  }
  
}
