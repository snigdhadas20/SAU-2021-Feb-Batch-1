import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class CommonService {

  constructor(private _http:HttpClient) { }

  createSession(session){
    return this._http.post("http://localhost:3000/sessions",session);
  }

  getAllSession(){
    return this._http.get("http://localhost:3000/sessions");
  }

  updateSession(session){
    return this._http.put("http://localhost:3000/sessions/"+session.id,session)
  }

  deleteSession(session){
    return this._http.delete("http://localhost:3000/sessions/"+ session.id)
  }

}
