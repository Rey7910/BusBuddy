import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';
import { ServiceUsuarioService } from '../Service/service-usuario.service';
import { ToastrService } from 'ngx-toastr';
import { Usuario } from '../Modelo/Usuario';


@Component({
  selector: 'app-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.css']
})
export class SettingsComponent implements OnInit {

  caja_info = true;
  caja_pass = false;

  constructor(private _location: Location, private serviceU:ServiceUsuarioService, private toastr:ToastrService) { }

  usuarios:Usuario[]
  mostrarusu = new Usuario();
  editUser=new Usuario();
  actualUser = new Usuario();
  mapU = new Map<number,Usuario>;

  idUsuario:number;
  passAntigua:String;
  passNueva:String;

  ngOnInit(): void {
    var idUsuarioS=sessionStorage.getItem("idUsuario");
    if (idUsuarioS != undefined){
      this.idUsuario=+idUsuarioS;
    }
    this.serviceU.getUsuarios().
    subscribe(data=>{
      this.usuarios=data; 
      this.usuarios.forEach(element => {
        this.mapU.set(element.idusuario,element)
      });

      var currentUser = this.mapU.get(this.idUsuario)
      if (currentUser != undefined){
        this.actualUser=currentUser
        this.mostrarusu = this.actualUser;

      }
      console.log(this.mostrarusu.apellido)
    });
    
  }

  Editar(user:Usuario):void{
    this.usuarios.forEach(element => {
      this.mapU.set(element.idusuario,element)
    });
    var currentUser = this.mapU.get(this.idUsuario)
    if (currentUser != undefined){
      this.actualUser=currentUser
    }
    user.idusuario = this.actualUser.idusuario
    user.usuario = this.actualUser.usuario
    user.contrasena = this.actualUser.contrasena
    user.rol = this.actualUser.rol
    if(user.nombre==null){
      user.nombre= this.actualUser.nombre
      
    }  
    if (user.apellido==null){
      user.apellido= this.actualUser.apellido
    }
    if (user.correo==null){
      user.correo= this.actualUser.correo
    }
    if (user.fechaNacimiento==null){
      user.fechaNacimiento= this.actualUser.fechaNacimiento
    }
    if (user.telefono==null){
      user.telefono = this.actualUser.telefono
    }

    this.serviceU.updateUsuario(user).subscribe(data=>{
      this.toastr.success("Usuario Editado con exito");
      window.location.reload();
    },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
    this.serviceU.getUsuarios().
    subscribe(data=>{
      this.usuarios=data;
    });
  }

  EditarC(user:Usuario,passA:String,passN:String):void{
    this.usuarios.forEach(element => {
      this.mapU.set(element.idusuario,element)
    });
    var currentUser = this.mapU.get(this.idUsuario)
    if (currentUser != undefined){
      this.actualUser=currentUser
    }
    if(passA==this.actualUser.contrasena){
      if(passN == user.contrasena){
        this.actualUser.contrasena = user.contrasena
        console.log(this.actualUser)
        this.serviceU.updateUsuario(this.actualUser).subscribe(data=>{
          this.toastr.success("Usuario Editado con exito");
          window.location.reload();
        },err =>this.toastr.error("Verifica datos, ha ocurrido un error"));
        this.serviceU.getUsuarios().
        subscribe(data=>{
          this.usuarios=data;
        });
      }else{
        this.toastr.error("La contraseña nueva no se corresponde con la repetición");
      }
      
    }else{
      this.toastr.error("La contraseña ingresada no corresponde con la contraseña actual");
    }
    
  }

  ver_info(){
    this.caja_info = true;
    this.caja_pass = false;
  }
  ver_pass(){
    this.caja_info = false;
    this.caja_pass = true;
  }
  goBack() {
    this._location.back();
  }

  cerrarSesion(){
    sessionStorage.clear();
  }

}
 
