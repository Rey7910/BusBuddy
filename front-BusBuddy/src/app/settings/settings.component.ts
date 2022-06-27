import { Component, OnInit } from '@angular/core';
import { Location } from '@angular/common';

@Component({
  selector: 'app-settings',
  templateUrl: './settings.component.html',
  styleUrls: ['./settings.component.css']
})
export class SettingsComponent implements OnInit {

  caja_info = true;
  caja_pass = false;

  constructor(private _location: Location) { }

  ngOnInit(): void {
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

}
