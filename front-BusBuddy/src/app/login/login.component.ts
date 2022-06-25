import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Usuario } from '../Modelo/Usuario';
import { ServiceUsuarioService } from '../Service/service-usuario.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  constructor(private router:Router, private service:ServiceUsuarioService, private toastr: ToastrService) { }
  usuarios:Usuario[]
  searchUser=new Usuario();
  map = new Map<String,Usuario>();

  ngOnInit(): void {
    this.service.getUsuarios().
    subscribe(data=>{
      this.usuarios = data
    });
  }

  public login(correo:String){
    this.usuarios.forEach(element => {
      this.map.set(element.correo,element)
    });
    var currentUser = this.map.get(correo)
    if(currentUser != undefined){
      if(this.searchUser.contrasena == currentUser.contrasena){
        this.toastr.success('Usuario loggeado con éxito');
        this.router.navigate(['/home-usuario'])
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


