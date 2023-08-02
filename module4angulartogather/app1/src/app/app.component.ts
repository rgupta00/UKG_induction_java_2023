import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  //data is used to access in html
   private title: string = 'UKG app'
   firstName:string='rajeev'
   secName: string='kumar'

   fullName():string{
    return `details is ${this.firstName} ${this.secName}`
   }
}
