import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-home-usuario',
  templateUrl: './home-usuario.component.html',
  styleUrls: ['./home-usuario.component.css']
})
export class HomeUsuarioComponent implements OnInit {

  tiquetever = false;

  constructor() { }

  ngOnInit(): void {
  }

  AparecerTiquetes(){
    this.tiquetever = true;
  }

}