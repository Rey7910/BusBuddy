import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Reserva } from '../Modelo/Reserva';

@Injectable({
  providedIn: 'root'
})
export class ServiceReservasService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/reservas';
  getReservas(){
    return this.http.get<Reserva[]>(this.Url);
  }
  getReservasUsuario(id:number){
    return this.http.get<Reserva[]>(this.Url+"/user="+id);
  }
  getReservasUsuarioYEstado(id:number,estado:number){
    return this.http.get<Reserva[]>(this.Url+"/user="+id+"/estado="+estado);
  }
  getReservasRuta(id:number){
    return this.http.get<Reserva[]>(this.Url+"/rute="+id);
  }
  getReservasRutaYEstado(id:number,estado:number){
    return this.http.get<Reserva[]>(this.Url+"/rute="+id+"/estado="+estado);
  }
  updateReserva(reserva:Reserva){
    return this.http.put<Reserva>(this.Url,reserva);
  } 

}
