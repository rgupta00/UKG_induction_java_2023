import { Component, OnInit } from '@angular/core';
import { EmpService } from '../emp.service';

@Component({
  selector: 'app-empdetails',
  template: `
    <ul *ngFor = "let emp of employees">
    <li>{{emp.id}}|{{emp.name}} | {{emp.salary}}</li>
  </ul>
  `,
  styles: []
})
export class EmpdetailsComponent implements OnInit {
//   public employees=[]
//   //first let we wait for ctr called completed and es injected
//    constructor(private es: EmpService) {
//    }

// //it is the brother of @postconstruct
//   ngOnInit() {
//     console.log('EmpdetailsComponent is called')
//     this.es.getEmployees().subscribe(function(data){
//       this.employees=data;
//     })
//   }
 public employees=[]
  constructor(private es: EmpService) {
   }
  ngOnInit() {
    console.log('empcomponent')
    this.es.getEmployees().subscribe(data=> this.employees=data)//? why only fat arrow?
  }
}
