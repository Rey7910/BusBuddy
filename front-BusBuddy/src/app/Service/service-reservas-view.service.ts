import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ReservaView } from '../Modelo/ReservaView';

@Injectable({
  providedIn: 'root'
})
export class ServiceReservasViewService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/reservasView';
  getReservas(){
    return this.http.get<ReservaView[]>(this.Url);
  }
  getReservasUsuario(id:number){
    return this.http.get<ReservaView[]>(this.Url+"/user="+id);
  }
  getReservasUsuarioYEstado(id:number,estado:number){
    return this.http.get<ReservaView[]>(this.Url+"/user="+id+"/estado="+estado);
  }
}
