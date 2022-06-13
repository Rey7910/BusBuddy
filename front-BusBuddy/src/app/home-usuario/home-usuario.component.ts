import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router'
import { Ruta } from '../Modelo/Ruta';
import {ServiceRutasService} from '../Service/service-rutas.service'
@Component({
  selector: 'app-home-usuario',
  templateUrl: './home-usuario.component.html',
  styleUrls: ['./home-usuario.component.css']
})
export class HomeUsuarioComponent implements OnInit {

  tiquetever = false;

  constructor(private service:ServiceRutasService, private router:Router) { }
  rutas:Ruta[];
  ngOnInit(): void {
    this.service.getRutas().subscribe(data=>{
      this.rutas=data;
    }) 
  }

  AparecerTiquetes(){
    console.log('aaa');
    this.service.getRutas().
    subscribe(data=>{
      this.rutas=data;
    }) ;
    this.tiquetever = true;
  }


}
