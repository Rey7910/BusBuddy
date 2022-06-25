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
}
