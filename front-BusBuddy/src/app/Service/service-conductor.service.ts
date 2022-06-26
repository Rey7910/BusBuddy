import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Conductor } from '../Modelo/Conductor';

@Injectable({
  providedIn: 'root'
})
export class ServiceConductorService {

  Url='http://localhost:8090/conductores';
  constructor(private http:HttpClient) { }
  getRutas(){
    return this.http.get<Conductor[]>(this.Url);
  }
  crearRuta(conductor:Conductor){
    return this.http.post<Conductor>(this.Url,conductor);
  }
  getRutaId(id:number){
    return this.http.get<Conductor>(this.Url+"/"+id);
  }
  updateRuta(conductor:Conductor){
    return this.http.put<Conductor>(this.Url,conductor);
  }
 /* deleteRuta(conductor:Conductor){
    return this.http.delete<Conductor>(this.Url+"/"+conductor.idRuta);
  }*/

}
