import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';
import { Usuario } from '../Modelo/Usuario';
import { ServiceUsuarioService } from '../Service/service-usuario.service';
import { Personal } from '../Modelo/Personal';
import { Empresa } from '../Modelo/Empresa';
import { Conductor } from '../Modelo/Conductor';
import { ServicePersonalService } from '../Service/service-personal.service';
import { ServiceEmpresaService } from '../Service/service-empresa.service';
import { ServiceConductorService } from '../Service/service-conductor.service';

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
  
  
  constructor(private serviceU:ServiceUsuarioService, private serviceP:ServicePersonalService, private serviceE:ServiceEmpresaService, private serviceC:ServiceConductorService, private toastr: ToastrService, private router: Router) { }
  usuarios:Usuario[]
  newUser=new Usuario();
  mapU=new Map<String,Usuario>;
  contrasena:String;
  aux = new Date;

  personal: Personal[]
  searchPersonal = new Personal();
  mapP=new Map<String,Personal>;

  empresas: Empresa[]
  searchEmpresa = new Empresa();
  mapE=new Map<String,Empresa>;

  conductores:Conductor[]
  newConductor = new Conductor();

  empresaId: number;
  flagVL = false;
  

  ngOnInit(): void {
    this.serviceU.getUsuarios().
    subscribe(data=>{
      this.usuarios=data;
    }) ;
    
    this.serviceP.getPersonal().
    subscribe(data=>{
      this.personal=data;
    }) ;

    this.serviceE.getEmpresas().
    subscribe(data=>{
      this.empresas=data;
    }) ;

    this.serviceC.getConductores().
    subscribe(data=>{
      this.conductores=data;
    }) ;

  }

  regresar(){
    if (this.box_vincu_lab==true) {
      this.box_registo = true;
      this.box_vincu_lab = false; 
      this. box_vincu_lab_2 = false;
      this.box_usuario = false;
      this.flagVL = false;
    }else if (this.box_vincu_lab_2==true){
      this.box_registo = false;
      this.box_vincu_lab = true;
      this.box_vincu_lab_2 = false;
      this.box_usuario = false;
      this.flagVL = false;
    }else if (this.box_usuario == true){
      this.box_registo = false;
      this.box_vincu_lab = false;
      this.box_vincu_lab_2 = true;
      this.box_usuario = false;  
      this.flagVL = false;  
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
      this.toastr.warning('El correo ya se encuentra registrado');
      window.location.reload();
    }

  }

  crearusuario(user:Usuario){


    if(this.contrasena==user.contrasena){


      // this.aux.setFullYear(user.fechaNacimiento.getFullYear())
      // this.aux.setMonth(user.fechaNacimiento.getMonth())
      // this.aux.setDate(user.fechaNacimiento.getDate()+1)


      this.serviceU.crearUsuario(user)
        .subscribe(data=>{
          this.toastr.success("Usuario Creado con exito");
          this.router.navigate(['/login'])
        }); 
      
    }else{
      this.toastr.warning("Las contraseñas no coinciden");
    }
  }
}
