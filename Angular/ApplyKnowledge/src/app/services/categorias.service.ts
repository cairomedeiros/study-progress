import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { ObsTipCategoria } from '../models/tipoObsCategoria';

@Injectable({
  providedIn: 'root'
})
export class CategoriasService {

  private url: string = 'http://localhost:3000/categorias';
  constructor(private http: HttpClient) { }

  getCategorias(): Observable<ObsTipCategoria[]>{
    return this.http.get<ObsTipCategoria[]>(this.url);
  }
}
