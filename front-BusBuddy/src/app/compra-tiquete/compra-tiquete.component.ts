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
  idUsuario:number;
  sillasOcupadas:Reserva[];
  tiqueteAComprar:Reserva;
  a:boolean[];
  constructor(private serviceReservas:ServiceReservasService, private router:Router,private toastr: ToastrService) { }

  ngOnInit(): void {
    sessionStorage.setItem("idUsuario","1");
    var x=sessionStorage.getItem("idRutaBuy");
    var idUsuarioS=sessionStorage.getItem("idUsuario");
    
    this.tiqueteAComprar=new Reserva()
    if(x!=null && idUsuarioS!=null){
      this.idRuta=+x;
      this.idUsuario=+idUsuarioS;
      this.a=[true,true,true,true,true,true, true,true,true,true,true,true,true,true,true,true, true,true,true,true,true,true,true,true,true,true, true,true,true]
      this.validarAsientos();
    }else{
      //Redirigir a una pagina de error

    }
    
    
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
  comprar(reservaAComprar:Reserva){
    
    if(this.idUsuario!=null){
      if(this.silla!=null && this.silla!=0){
        this.tiqueteAComprar.silla=this.silla;
        this.tiqueteAComprar.idUsuario=this.idUsuario;
        this.tiqueteAComprar.idRuta=this.idRuta;
        this.serviceReservas.crearReserva(reservaAComprar).subscribe(data=>{
          this,this.toastr.success("Tiquete comprado con exito");
          this.router.navigate(['/home-usuario']);
        },error=>{
          this.toastr.error("Ha ocurrido un error al realizar la compra");
        });
      }else{
        this.toastr.error("Selecciona un asiento por favor");
      }
    }else{
      this.toastr.error("Ha ocurrido un error con la autenticación de sesión del usuario");
    }
    
  }
}
