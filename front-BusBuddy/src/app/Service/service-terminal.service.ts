import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Terminal } from '../Modelo/Terminal';

@Injectable({
  providedIn: 'root'
})
export class ServiceTerminalService {
  Url='http://localhost:8090/terminales';
  constructor(private http:HttpClient) { }
  getTerminales(){
    return this.http.get<Terminal[]>(this.Url);
  }
  getTerminalIdx(idx:number){
    return this.http.get<Terminal>(this.Url+"/"+idx);      
    
  }
}
