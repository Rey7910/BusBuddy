import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ConductorView } from '../Modelo/ConductorView';

@Injectable({
  providedIn: 'root'
})
export class ServiceConductorViewService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/conductor_info';
  getConductores(){
    return this.http.get<ConductorView[]>(this.Url);
  }
}
