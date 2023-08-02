import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-cal',
  templateUrl: './cal.component.html',
  styleUrls: ['./cal.component.css']
})
export class CalComponent {

  title = 'app1';
  mydate=Date.now();
  
  num1:number=0;
  num2:number=0;
  result:number=0;

 addition() {
   this.result= this.num1+ this.num2;
 }
 mul() {
  this.result= this.num1* this.num2;
}

}
