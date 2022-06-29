import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { RutaView } from '../Modelo/RutaView';
@Injectable({
  providedIn: 'root'
})
export class ServiceRutasViewService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/rutasView';
  getRutas(){
    return this.http.get<RutaView[]>(this.Url);
  }
  getRutasConductor(id:number){
    return this.http.get<RutaView[]>(this.Url+"/conductor="+id);
  }
  getRutasFiltradas(origen:number, destino:number, fechaSalida:Date, precioMin:number, precioMax:number){
    return this.http.get<RutaView[]>(this.Url+"/consultaFiltradao="+origen+"d="+destino+"f="+fechaSalida+"min="+precioMin+"max="+precioMax);
  }
  getRutasEmpresa(id:number){
    return this.http.get<RutaView[]>(this.Url+"/empresa="+id);
  }
  
}
