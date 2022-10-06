import { Injectable } from '@angular/core';
import { HttpClient} from '@angular/common/http';
import { Observable} from 'rxjs';
import { ObsTip } from '../models/tipoObs';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url: string = 'http://localhost:3000/employee'

  constructor(private http: HttpClient) { }

  public getEmployee(): Observable<ObsTip[]>{
    return this.http.get<ObsTip[]>(this.url);
  }
}
