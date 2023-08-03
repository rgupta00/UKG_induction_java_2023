import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-dept-detail',
  template: `
    the dept is {{deptId}}
  `,
  styles: []
})
export class DeptDetailComponent implements OnInit {

  public deptId;

  constructor(private route: ActivatedRoute) { }

  ngOnInit() {
    // tslint:disable-next-line: radix
    let id= parseInt(this.route.snapshot.paramMap.get('id'));
    this.deptId = id;
  }

}
