import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Ruta } from '../Modelo/Ruta'
@Injectable({
  providedIn: 'root'
})
export class ServiceRutasService {
  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/rutas';

  getRutas(){
    return this.http.get<Ruta[]>(this.Url);
  }
  crearRuta(ruta:Ruta){
    return this.http.post<Ruta>(this.Url,ruta);
  }
}
