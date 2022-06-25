import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { take } from 'rxjs';
import { Ruta } from '../Modelo/Ruta';
import { RutaView } from '../Modelo/RutaView';
import { Terminal } from '../Modelo/Terminal';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';
import { ServiceTerminalService } from '../Service/service-terminal.service';
@Component({
  selector: 'app-home-usuario',
  templateUrl: './home-usuario.component.html',
  styleUrls: ['./home-usuario.component.css']
})
export class HomeUsuarioComponent implements OnInit {

  tiquetever = false;
  constructor(private serviceRutas:ServiceRutasViewService,private serviceTerminales:ServiceTerminalService, private router:Router) {
    this.rutas=[];
   }
  rutas:RutaView[];
  ngOnInit(): void {
  }

  AparecerTiquetes(){
    this.serviceRutas.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    
    this.tiquetever = true;
  }
  
  

}
