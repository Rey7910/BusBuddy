import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { Usuario } from '../Modelo/Usuario';
import { ServiceUsuarioService } from '../Service/service-usuario.service';
import { Personal } from '../Modelo/Personal';
import { Empresa } from '../Modelo/Empresa';

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

  constructor(private serviceU:ServiceUsuarioService, private toastr: ToastrService, private router: Router) { }
  usuarios:Usuario[]
  newUser=new Usuario();
  mapU=new Map<String,Usuario>;

  personal: Personal[]
  searchPersonal = new Personal();
  mapP=new Map<String,Personal>;

  empresas: Empresa[]
  searchEmpresa = new Empresa();
  mapE=new Map<String,Empresa>;

  flagVL = false;
  

  ngOnInit(): void {
    this.serviceU.getUsuarios().
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
      this.mapU.set(element.correo,element)
    });
    var currentUser = this.mapU.get(this.newUser.correo)
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
    this.serviceU.crearUsuario(user)
    .subscribe(data=>{
      this.toastr.success("Usuario Creado con exito");
      this.router.navigate(['/login'])
    }); 
    if(this.flagVL){
      
    }

  }


}
