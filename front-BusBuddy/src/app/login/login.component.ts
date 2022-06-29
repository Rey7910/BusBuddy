import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { AdministradorEmpresa } from '../Modelo/AdministradorEmpresa';
import { Conductor } from '../Modelo/Conductor';
import { Usuario } from '../Modelo/Usuario';
import { ServiceAdminEmpresaService } from '../Service/service-admin-empresa.service';
import { ServiceConductorService } from '../Service/service-conductor.service';
import { ServiceUsuarioService } from '../Service/service-usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router, private service:ServiceUsuarioService, private serviceAdminE:ServiceAdminEmpresaService, private serviceC:ServiceConductorService, private toastr: ToastrService) { }
  usuarios:Usuario[]
  searchUser=new Usuario();
  map = new Map<String,Usuario>();

  adminsE:AdministradorEmpresa[]
  mapAE = new Map<number,AdministradorEmpresa>();

  conductores:Conductor[]
  mapC = new Map<number,Conductor>();

  ngOnInit(): void {
    this.service.getUsuarios().
    subscribe(data=>{
      this.usuarios = data
    });

    this.serviceAdminE.getAdminsEmpresa().
    subscribe(data=>{
      this.adminsE = data
    });

    this.serviceC.getConductores().
    subscribe(data=>{
      this.conductores = data
    });
    
  }

  public login(correo:String){
    this.usuarios.forEach(element => {
      this.map.set(element.correo,element)
    });

    this.adminsE.forEach(element => {
      this.mapAE.set(element.idusuario,element)
    });

    this.conductores.forEach(element => {
      this.mapC.set(element.idUsuario,element)
    });

    var currentUser = this.map.get(correo)
    if(currentUser != undefined){
      var currentAdminE = this.mapAE.get(currentUser.idusuario)
      var currentConductor = this.mapC.get(currentUser.idusuario)
      if(this.searchUser.contrasena == currentUser.contrasena){
        
        sessionStorage.setItem("idUsuario",currentUser.idusuario.toString())
        
        if(currentUser.rol == 0){ //cliente
          sessionStorage.setItem("rol","0")
          this.toastr.success('Usuario loggeado con éxito');
          this.router.navigate(['/home-usuario'])
        }
        else if(currentUser.rol == 1 && currentAdminE != undefined){ //administrador de empresa
          sessionStorage.setItem("rol","1")
          sessionStorage.setItem("idEmpresa",currentAdminE.idempresa.toString())
          this.toastr.success('Usuario loggeado con éxito');
          this.router.navigate(['/asignar-rutas-empresa'])
        }
        else if (currentUser.rol == 3){ //administrador de terminal
          sessionStorage.setItem("rol","3")
          this.toastr.success('Usuario loggeado con éxito');
          //this.router.navigate(['/terminal'])
        }
        else if (currentUser.rol == 2 && currentConductor != undefined){ //conductor
          sessionStorage.setItem("rol","2")
          sessionStorage.setItem("idEmpresa",currentConductor.idEmpresa.toString())
          
          this.toastr.success('Usuario loggeado con éxito');
          this.router.navigate(['/mis-rutas'])
        }
        
      }
      else{
        this.toastr.error('Contraseña incorrecta, vuelva a intentarlo');
      }
    }
    else{
      this.toastr.error('El correo no se encuentra registrado');
    }
  }

}


