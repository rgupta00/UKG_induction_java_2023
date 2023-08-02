import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Employee } from './employee';
@Injectable({
  providedIn: 'root'
})
export class EmpService {

  private url = 'http://localhost:9090/empapp/api/employees';

  constructor( private http: HttpClient) { }

  //this this.http.get will give u Obserable of Employee object
  public getEmployees(): Observable<Employee[]>{
    return this.http.get<Employee[]>(this.url);
   }
}
