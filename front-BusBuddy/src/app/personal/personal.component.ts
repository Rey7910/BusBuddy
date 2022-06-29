import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Personal } from '../Modelo/Personal';
import { Usuario } from '../Modelo/Usuario';
import { ServiceEmpresaService } from '../Service/service-empresa.service';
import { ServicePersonalService } from '../Service/service-personal.service';
import { ServiceUsuarioService } from '../Service/service-usuario.service';

@Component({
  selector: 'app-personal',
  templateUrl: './personal.component.html',
  styleUrls: ['./personal.component.css']
})
export class PersonalComponent implements OnInit {

  constructor(private serviceP:ServicePersonalService, private serviceU:ServiceUsuarioService, private toastr: ToastrService, private router: Router) { }
  newUser = new Usuario();
  idusuario :number

  newPerso=new Personal();
  personal:Personal[];
  boton_crear = true;
  caja_crear = false;
  caja_editar = false;
  ssidempresa = false;
  ssusuario = false;

  ngOnInit(): void {
    this.serviceP.getPersonal().
    subscribe(data=>{
      this.personal=data;
      console.log(data)
    });
  }

  crearpersonall(perso: Personal){
    this.crearUserVacio(this.newUser)
      
    
    setTimeout(()=>{
      var idemp = sessionStorage.getItem("idEmpresa")
      if(idemp != null){
        perso.idempresa =+ idemp  
      }

      perso.idusuario = this.idusuario ;
      console.log(perso.idusuario, this.idusuario);
      this.serviceP.crearPersonal(perso)
      .subscribe(data=>{
        this.toastr.success("Persona Creado con exito");
        window.location.reload();
        console.log(perso)

      },err=>{
        this.toastr.error(perso.idusuario+"");
      }); 
  },1000);
    
    

  }

  crearUserVacio(userV:Usuario){
    userV.fechaNacimiento= new Date("2000-01-01")
    userV.rol= 2
    userV.telefono=123123
    this.serviceU.crearUsuario(userV)
    .subscribe(data=>{
      this.idusuario = data.idusuario;
      console.log(data.idusuario, this.idusuario)
    });
  }

  cambiar_estado_caja(){
   if(this.boton_crear==true){
      this.boton_crear = false;
      this.caja_crear = true; 
      console.log("aaa2aaa")

  } else if (this.caja_crear == true && this.boton_crear == false){
    this.boton_crear = true;
    this.caja_crear = false; 
    console.log("aaaaaa")

  }
  
}

cambiar_estado_caja2(){
  if(this.caja_editar==true){
     this.caja_editar = false;
     console.log("aaa2aaa")

 } else if (this.caja_editar == false){
 this.caja_editar = true;
 }
 
}

}
