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
  mapP=new Map<number,Personal>;

  boton_crear = true;
  caja_crear = false;
  caja_editar = false;
  ssidempresa = false;
  ssusuario = false;
  nombreEmpresa: string | null;

  ngOnInit(): void {
    this.nombreEmpresa = sessionStorage.getItem("nombreEmpresa")
    this.serviceP.getPersonal().
    subscribe(data=>{
      this.personal=data;
      console.log(data)
    });
  }

  crearpersonall(perso: Personal){
    this.crearUserVacio(this.newUser)
    if (perso.nombre == null || perso.apellido == null || perso.telefono == null || perso.eps == null || perso.ciudad == null || perso.id == null || perso.pin == null) {
      this.toastr.error("Por favor diligenciar todos los datos correctamente", "Datos incompletos")
    }
    else {  
    
      setTimeout(()=>{
        var idemp = sessionStorage.getItem("idEmpresa")
        if(idemp != null){
          perso.idempresa =+ idemp  
        }

        perso.idusuario = this.idusuario ;
        perso.cargo = "Conductor";
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

  Editar(persona:Personal):void{
    this.personal.forEach(element => {
      this.mapP.set(element.idpersonal,element)
    });
    var currentPersonal = this.mapP.get(persona.idpersonal)
    if(currentPersonal!=undefined){
      persona.idusuario=currentPersonal.idusuario
      persona.cargo = "Conductor";
      var idemp = sessionStorage.getItem("idEmpresa");
      if(idemp != undefined){
        persona.idempresa=+ idemp;
        this.serviceP.crearPersonal(persona).subscribe(data=>{
          this.toastr.success("Persona Editada con exito");
          window.location.reload();
        },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
        this.serviceP.getPersonal().
        subscribe(data=>{
          this.personal=data;
          console.log(data)
        });
      } 
    }
    
    
  }

  Editar2(id:number){
  this.newPerso.idpersonal=id;
  this.cambiar_estado_caja2() 
  }

  Eliminar(id:number){
    if(confirm("¿Seguro quieres eliminar el personal?")) {
      this.serviceP.deletePersonalId(id).subscribe(data=>{
        this.toastr.success("Personal Eliminado con exito");
        window.location.reload();
      },err =>this.toastr.error("Ha ocurrido un error al intentar eliminar"));
      this.serviceP.getPersonal().
      subscribe(data=>{
        this.personal=data;
        console.log(data)
      });
    }
  }

}
