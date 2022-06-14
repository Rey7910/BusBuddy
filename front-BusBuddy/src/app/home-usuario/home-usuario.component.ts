import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { Ruta } from '../Modelo/Ruta';
import { Terminal } from '../Modelo/Terminal';
import {ServiceRutasService} from '../Service/service-rutas.service'
import { ServiceTerminalService } from '../Service/service-terminal.service';
@Component({
  selector: 'app-home-usuario',
  templateUrl: './home-usuario.component.html',
  styleUrls: ['./home-usuario.component.css']
})
export class HomeUsuarioComponent implements OnInit {

  tiquetever = false;
  terminalAux= new Terminal();
  constructor(private serviceRutas:ServiceRutasService,private serviceTerminales:ServiceTerminalService, private router:Router) { }
  rutas:Ruta[];
  ngOnInit(): void {
  }

  AparecerTiquetes(){
    this.serviceRutas.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    this.tiquetever = true;
  }
  /*getTerminalString(index:number):String{
    
    this.serviceTerminales.getTerminalIdx(+index).
    subscribe(data=>{
      this.terminalAux=data;
    }
    );
    return this.terminalAux.nombre;
  }*/
  getNombreTerminal(index:number){
    r:String;
    this.serviceTerminales.getTerminalName(index)
    .subscribe(date=>{
      return date;
    });

  }
 

}
