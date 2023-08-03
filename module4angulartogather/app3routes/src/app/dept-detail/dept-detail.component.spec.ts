import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { DeptDetailComponent } from './dept-detail.component';

describe('DeptDetailComponent', () => {
  let component: DeptDetailComponent;
  let fixture: ComponentFixture<DeptDetailComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ DeptDetailComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(DeptDetailComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
