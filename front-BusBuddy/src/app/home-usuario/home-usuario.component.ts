import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { take } from 'rxjs';
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
  constructor(private serviceRutas:ServiceRutasService,private serviceTerminales:ServiceTerminalService, private router:Router) {
    this.rutas=[];
   }
  rutas:Ruta[];
  a:String;
  ngOnInit(): void {
  }

  AparecerTiquetes(){
    this.serviceRutas.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    
    this.tiquetever = true;
    console.log("Nombre Terminal 1: "+this.getNombreTerminal(1));
  }
  /*getTerminalString(index:number):String{
    
    this.serviceTerminales.getTerminalIdx(+index).
    subscribe(data=>{
      this.terminalAux=data;
    }
    );
    return this.terminalAux.nombre;
  }*/
  getNombreTerminal(index:number):String{
  console.log("Ejecutandose xd"+index);
    var nombre=new String("");
  this.serviceTerminales.getTerminalIdx(+index).pipe(take(1)).subscribe(data=>{
    this.a=data.nombre;
  }
   
  
    );
    nombre=String(this.a+"");
    console.log(nombre+"AAAAA");
    return String(nombre);
    //return "AA"
  }

}
