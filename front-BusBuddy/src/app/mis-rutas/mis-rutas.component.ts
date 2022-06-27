import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ruta } from '../Modelo/Ruta';
import { RutaView } from '../Modelo/RutaView';
import { ServiceRutasViewService } from '../Service/service-rutas-view.service';

@Component({
  selector: 'app-mis-rutas',
  templateUrl: './mis-rutas.component.html',
  styleUrls: ['./mis-rutas.component.css']
})
export class MisRutasComponent implements OnInit {

  constructor(private serviceRutasView:ServiceRutasViewService, private router:Router) { }
  rutas:RutaView[];
  ngOnInit(): void {

    this.serviceRutasView.getRutasConductor(1).subscribe(data=>
      this.rutas=data
    );
    console.log(this.rutas);
  }

}
