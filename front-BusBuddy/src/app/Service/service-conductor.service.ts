import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Conductor } from '../Modelo/Conductor';

@Injectable({
  providedIn: 'root'
})
export class ServiceConductorService {

  Url='http://localhost:8090/conductor';
  constructor(private http:HttpClient) { }
  getConductores(){
    return this.http.get<Conductor[]>(this.Url);
  }
  crearConductor(conductor:Conductor){
    return this.http.post<Conductor>(this.Url,conductor);
  }
  getConductorId(id:number){
    return this.http.get<Conductor>(this.Url+"/"+id);
  }
  updateConductor(conductor:Conductor){
    return this.http.put<Conductor>(this.Url,conductor);
  }
 /* deleteRuta(conductor:Conductor){
    return this.http.delete<Conductor>(this.Url+"/"+conductor.idRuta);
  }*/

}
