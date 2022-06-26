import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class ServiceConductorService {

  Url='http://localhost:8090/conductores';
  constructor(private http:HttpClient) { }
  /*getTerminales(){
    return this.http.get<Terminal[]>(this.Url);
  }
  getTerminalIdx(idx:number){
    return this.http.get<Terminal>(this.Url+"/"+idx);      
    
  }
  getTerminalName(idx:number){
    return this.http.get<String>(this.Url+"/name/"+idx);
  }*/
}
