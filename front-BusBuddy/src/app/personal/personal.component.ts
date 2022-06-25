import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { Personal } from '../Modelo/Personal';
import { ServicePersonalService } from '../Service/service-personal.service';

@Component({
  selector: 'app-personal',
  templateUrl: './personal.component.html',
  styleUrls: ['./personal.component.css']
})
export class PersonalComponent implements OnInit {

  constructor(private serviceP:ServicePersonalService, private toastr: ToastrService, private router: Router) { }

  personal:Personal[];

  ngOnInit(): void {
    this.serviceP.getPersonal().
    subscribe(data=>{
      this.personal=data;
    }) ;
  }

  

}
