import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { Usuario } from '../Modelo/Usuario';
import { ServiceUsuarioService } from '../Service/service-usuario.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})

export class RegisterComponent implements OnInit {
  box_registo = true;
  box_vincu_lab = false; 
  box_vincu_lab_2 = false;
  box_usuario = false;

  constructor(private service:ServiceUsuarioService, private toastr: ToastrService, private router: Router) { }
  usuarios:Usuario[]
  newUser=new Usuario();
  map=new Map<String,Usuario>;

  ngOnInit(): void {
    this.service.getUsuarios().
    subscribe(data=>{
      this.usuarios=data;
    }) ;

  }

  regresar(){
    if (this.box_vincu_lab==true) {
      this.box_registo = true;
      this.box_vincu_lab = false; 
      this. box_vincu_lab_2 = false;
      this.box_usuario = false;
    }else if (this.box_vincu_lab_2==true){
      this.box_registo = false;
      this.box_vincu_lab = true;
      this.box_vincu_lab_2 = false;
      this.box_usuario = false;
    }else if (this.box_usuario == true){
      this.box_registo = false;
      this.box_vincu_lab = false;
      this.box_vincu_lab_2 = true;
      this.box_usuario = false;    
    }

  }

  cambio(){
    this.box_registo = false;
    this.box_vincu_lab = true;
    this.box_vincu_lab_2 = false;
    this.box_usuario = false;
  }

  cambio2(){
    this.box_registo = false;
    this.box_vincu_lab = false;
    this.box_vincu_lab_2 = true;
    this.box_usuario = false;
  }

  cambio3(){
    this.usuarios.forEach(element => {
      this.map.set(element.correo,element)
    });
    var currentUser = this.map.get(this.newUser.correo)
    if(currentUser == undefined){
        this.box_registo = false;
        this.box_vincu_lab = false;
        this.box_vincu_lab_2 = false;
        this.box_usuario = true;
        this.newUser.rol=0; 
    }
    else{
      window.alert('El correo ya se encuentra registrado');
      window.location.reload();
    }

  }

  crearusuario(user:Usuario){
    this.service.crearUsuario(user)
    .subscribe(data=>{
      this.toastr.success("Usuario Creado con exito");
      this.router.navigate(['/login'])
    }); 

  }


}
