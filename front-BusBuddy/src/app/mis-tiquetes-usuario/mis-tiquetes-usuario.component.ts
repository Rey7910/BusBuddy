import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Reserva } from '../Modelo/Reserva';
import { ReservaView } from '../Modelo/ReservaView';
import { ServiceReservasViewService } from '../Service/service-reservas-view.service';

@Component({
  selector: 'app-mis-tiquetes-usuario',
  templateUrl: './mis-tiquetes-usuario.component.html',
  styleUrls: ['./mis-tiquetes-usuario.component.css']
})
export class MisTiquetesUsuarioComponent implements OnInit {
  tiquetes:ReservaView[];
  constructor(private serviceReservasView:ServiceReservasViewService, private router:Router) { }
  
  ngOnInit(): void {
    sessionStorage.setItem("idUsuario",'1');
    this.filtrarTodos();
  }
  filtrarTodos(){
    var idE=sessionStorage.getItem("idUsuario");
    if(idE!=null){
      var id: number= +idE;
      this.serviceReservasView.getReservasUsuario(id).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
    }
    
  }
  filtrar(estado:number){
    var idE=sessionStorage.getItem("idEmpresa");
    if(idE!=null){
      var id: number= +idE;
      this.serviceReservasView.getReservasUsuarioYEstado(id,estado).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
    }
  }
  filtrarVencidos(){
    this.filtrar(2);
  }
  filtrarDisponibles(){
    this.filtrar(0);
  }
  filtrarAbordados(){
    this.filtrar(1);
  }
}
