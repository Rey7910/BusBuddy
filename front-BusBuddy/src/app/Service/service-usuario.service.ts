import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http'
import { Usuario } from '../Modelo/Usuario';

@Injectable({
  providedIn: 'root'
})
export class ServiceUsuarioService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/usuario';

  getUsuarios(){
    return this.http.get<Usuario[]>(this.Url);
  }

  crearUsuario(usuario:Usuario){
    return this.http.post<Usuario>(this.Url,usuario);
  }

  getUsuarioId(id:number){
    return this.http.get<Usuario>(this.Url+"/"+id);
  }
  updateUsuario(usuario:Usuario){
    return this.http.put<Usuario>(this.Url,usuario)
  }
}
