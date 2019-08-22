import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Usuario } from '../models/usuario';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class UsuarioServiceService {

  constructor(private http: HttpClient) { }

  getAll(): Observable<Usuario[]>{
    return this.http.get<Usuario[]>('http://localhost:8080/VerificacionProyecto/webapi/usuario');
  }

  getById(id: number): Observable<Usuario[]>{
    return this.http.get<Usuario[]>('http://localhost:8080/VerificacionProyecto/webapi/usuario/' + id);
  } 

  add(usuario: Usuario): Observable<any>{
    return this.http.post('http://localhost:8080/VerificacionProyecto/webapi/usuario', usuario);
  }

  update(id:number , usuario: Usuario): Observable<any>{
    return this.http.put('http://localhost:8080/VerificacionProyecto/webapi/usuario/' + id, usuario);
  }
}
