import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Personal } from '../Modelo/Personal';

@Injectable({
  providedIn: 'root'
})
export class ServicePersonalService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/personal';

  getPersonal(){
    return this.http.get<Personal[]>(this.Url);
  }

  crearPersonal(personal:Personal){
    return this.http.post<Personal>(this.Url,personal);
  }

  deletePersonal(personal:Personal){
    return this.http.delete<Personal>(this.Url);
  }
  deletePersonalId(idPersonal:number){
    return this.http.delete<Personal>(this.Url+"/"+idPersonal);
  }
}