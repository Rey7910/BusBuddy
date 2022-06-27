import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Reserva } from '../Modelo/Reserva';
import { ServiceReservasService } from '../Service/service-reservas.service';

@Component({
  selector: 'app-compra-tiquete',
  templateUrl: './compra-tiquete.component.html',
  styleUrls: ['./compra-tiquete.component.css']
})
export class CompraTiqueteComponent implements OnInit {

  silla= 0;
  idRuta:number;
  sillasOcupadas:Reserva[];
  a:boolean[];
  constructor(private serviceReservas:ServiceReservasService, private router:Router,private toastr: ToastrService) { }

  ngOnInit(): void {
    var x=sessionStorage.getItem("idRutaBuy");
    if(x!=null){
      this.idRuta=+x;
    }
    
    this.a=[true,true,true,true,true,true, true,true,true,true,true,true,true,true,true,true, true,true,true,true,true,true,true,true,true,true, true,true,true]
    this.validarAsientos();
  }
  sillaClick(silla:number){
    if(this.a[silla]){
      this.silla=silla;
    }else{
      this.toastr.info("Selecciona un asiento válido por favor");
    }

  }
  validarAsientos(){
    if(this.idRuta!=null){
      this.serviceReservas.getReservasRuta(this.idRuta).subscribe(data=>{
        this.sillasOcupadas=data;
        for(let i in data){
          if(data[i].silla!=null){
            this.a[data[i].silla]=false;
          }
        }
      });
      
    }else{
      console.log("AAAAA");
    }
    
  }
}
