import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Bus } from '../Modelo/Bus';

@Injectable({
  providedIn: 'root'
})
export class ServiceBusService {

  Url='http://localhost:8090/bus';
  constructor(private http:HttpClient) { }
  getBuses(){
    return this.http.get<Bus[]>(this.Url);
  }
  crearBus(bus:Bus){
    return this.http.post<Bus>(this.Url,bus);
  }
  getBusId(id:number){
    return this.http.get<Bus>(this.Url+"/"+id);
  }
  updateBus(bus:Bus){
    return this.http.put<Bus>(this.Url,bus);
  }
}
