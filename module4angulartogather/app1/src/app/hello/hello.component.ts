import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-hello2',
  templateUrl: './hello.component.html',
  styleUrls: []
})
export class HelloComponent implements OnInit {

  title:string='this is a title';
  
  // data:number=0;

  // callmethod(event){
  //   //console.log(this.data)
  //   this.data =event.target.value;
  //   // this.data +=event.target.value;
	//   //  console.log(event);
  // }


  // isHidden: boolean=false;
  // helloData: string="hello component data"
  // constructor() {
  //   console.log('ctr is called')
  //  }
  //it is same as postconstruct
  ngOnInit() {
    console.log('int is called')
  }

}
