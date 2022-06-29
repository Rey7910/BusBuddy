import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ContadoresView } from '../Modelo/ContadoresView';
import { EstadoReservaView } from '../Modelo/EstadoReservaView';

@Injectable({
  providedIn: 'root'
})
export class ServiceEstadisticasService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/estadisticas';

  getContadores(){
    return this.http.get<ContadoresView[]>(this.Url+"/contadores_estadoRutas");
  }
  getEstadosReservas(){
    return this.http.get<EstadoReservaView[]>(this.Url+"/contadores_estadoReservas");
  }

}
