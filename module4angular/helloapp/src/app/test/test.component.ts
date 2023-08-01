import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.css']
})
export class TestComponent implements OnInit {
  title:string='this is a title';
  // email = 'r@r.gupta';

  // getEmail(){
  //   console.log(this.email);
  // }


  // // count =0;
  // // data = '';
  // // myenvent(event){
  // //   this.data +=event.target.value+";";
	// // console.log(event);
  // // }

  // private num1:number=0;
  // private num2:number=0;
  // private result:number=0;

  // addition() {
  //   console.log(this.num1)
  //   console.log(this.num2)
  //   this.result= this.num1+ this.num2;
  // }
  constructor() { }

  ngOnInit() {
  }

}
