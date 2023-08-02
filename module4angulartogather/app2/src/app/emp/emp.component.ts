import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-emp',
  template: `
    <ul *ngFor = "let emp of employees">
    <li>{{emp.name}}</li>
  </ul>
  `,
  styles: []
})
export class EmpComponent implements OnInit {

  public employees=[]
  
  constructor(private es: EmpService) {
   }
  ngOnInit() {
    console.log('empcomponent')
    this.es.getEmployees().subscribe(data=> this.employees=data)
  }
}
