import { Component, OnInit } from '@angular/core';
import { ToastrService } from 'ngx-toastr';
import { Router } from '@angular/router';


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

  constructor(private toastr: ToastrService, private router: Router) { }

  ngOnInit(): void {

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
    this.box_registo = false;
    this.box_vincu_lab = false;
    this.box_vincu_lab_2 = false;
    this.box_usuario = true;
  }

  crearusuario(){

    this.toastr.success('Usuario creado con exito');
    this.router.navigate(['/login'])

  }


}
