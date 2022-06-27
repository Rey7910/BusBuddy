import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Empresa } from '../Modelo/Empresa';

@Injectable({
  providedIn: 'root'
})
export class ServiceEmpresaService {

  constructor(private http:HttpClient) { }
  Url='http://localhost:8090/empresa';

  getEmpresas(){
    return this.http.get<Empresa[]>(this.Url);
  }

  crearEmpresa(empresa:Empresa){
    return this.http.post<Empresa>(this.Url,empresa);
  }

  deleteEmpresa(empresa:Empresa){
    return this.http.delete<Empresa>(this.Url);
  }
  deleteEmpresaId(idEmpresa:number){
    return this.http.delete<Empresa>(this.Url+"/"+idEmpresa);
  }
}
