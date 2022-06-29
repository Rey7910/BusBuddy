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
  idUsuario:number;
  constructor(private serviceReservasView:ServiceReservasViewService, private router:Router) { }
  
  ngOnInit(): void {
    var idE=sessionStorage.getItem("idUsuario");
    if(idE!=null){
      this.idUsuario=+idE;
      this.filtrarTodos();
    }else{
      this.cerrarSesion();
      this.router.navigate(['/pagina-error']);
    }
    
  }
  filtrarTodos(){
      this.serviceReservasView.getReservasUsuario(this.idUsuario).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
    
    
  }
  filtrar(estado:number){
      this.serviceReservasView.getReservasUsuarioYEstado(this.idUsuario,estado).subscribe(data=> //0 Para validar boletos aun no validados
        this.tiquetes=data
      );
    
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
  cerrarSesion(){
    sessionStorage.clear();
  }
}
