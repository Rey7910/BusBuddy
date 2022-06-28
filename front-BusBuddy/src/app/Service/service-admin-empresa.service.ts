import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { AdministradorEmpresa } from '../Modelo/AdministradorEmpresa';

@Injectable({
  providedIn: 'root'
})
export class ServiceAdminEmpresaService {

  constructor(private http:HttpClient) { }
  Url = 'http://localhost:8090/adminEmpresa';

  getAdminsEmpresa(){
    return this.http.get<AdministradorEmpresa[]>(this.Url);
  }

  crearAdminEmpresa(adminE:AdministradorEmpresa){
    return this.http.post<AdministradorEmpresa>(this.Url,adminE);
  }

  getAdminEmpresaId(id:number){
    return this.http.get<AdministradorEmpresa>(this.Url+"/"+id);
  }
  updateAdminEmpresa(adminE:AdministradorEmpresa){
    return this.http.put<AdministradorEmpresa>(this.Url+"/"+adminE.idadministrador_empresa,adminE)
  }
}
