import { Component, OnInit } from '@angular/core';
import { ServiceRutasService } from '../Service/service-rutas.service';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  rutas:Ruta[]
  constructor() { }

  ngOnInit(): void {
    
  }

}
