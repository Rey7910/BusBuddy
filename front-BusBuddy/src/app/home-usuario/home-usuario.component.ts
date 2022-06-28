import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { take } from 'rxjs';
import { Ruta } from '../Modelo/Ruta';
import { RutaView } from '../Modelo/RutaView';
import { Terminal } from '../Modelo/Terminal';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { ServiceTerminalService } from '../Service/service-terminal.service';
import { ToastrService } from 'ngx-toastr';

@Component({
  selector: 'app-home-usuario',
  templateUrl: './home-usuario.component.html',
  styleUrls: ['./home-usuario.component.css']
})
export class HomeUsuarioComponent implements OnInit {

  tiquetever = false;
  constructor(private serviceRutasView: ServiceRutasViewService, private serviceTerminales: ServiceTerminalService, private router: Router, private toastr: ToastrService ) {
    this.rutas=[];
   }
  rutas:RutaView[];
  terminales:Terminal[];
  verOrigen:number;
  verDestino: number;
  verFechasalida: Date;
  verMinprecio: number;
  verMaxprecio: number;

  
  ngOnInit(): void {


    
    this.serviceTerminales.getTerminales().subscribe(data => {
      this.terminales = data;
    });
  }

  AparecerTiquetes(){
    
    if (this.verOrigen == null || this.verDestino == null || this.verFechasalida == null || this.verMaxprecio == null || this.verMinprecio == null){
      this.tiquetever = false;
      this.toastr.error("Ingresar todos los datos","Busqueda no realizada");
      
    }
    else if (this.verOrigen == this.verDestino) {
      this.tiquetever = false;
      this.toastr.error("Ingresar un origen diferente a destino", "Origen igual a destino");
    }
    else{
    this.serviceRutasView.getRutasFiltradas(this.verOrigen,this.verDestino,this.verFechasalida,this.verMinprecio,this.verMaxprecio).
    subscribe(data=>{
      this.rutas=data;
      if(data.length>0){
        this.tiquetever = true;
        this.toastr.success( "Busqueda realizada");
      }else{
        this.tiquetever = false;
        this.toastr.info("No hay viajes que coincidad con las carácteristicas que necesitas");
      }
    }) ;
    
      
      

    }
    
  }
  comprar(idRuta:number){
    sessionStorage.setItem("idRutaBuy",idRuta.toString());
    this.router.navigate(['/compra-tiquete']);
  }
  AparecerTodos(){
    this.tiquetever = true;
  }
  
  

}
