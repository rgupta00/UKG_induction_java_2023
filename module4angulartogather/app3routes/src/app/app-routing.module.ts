import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { DeptlistComponent } from './deptlist/deptlist.component';
import { EmplistComponent } from './emplist/emplist.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { DeptDetailComponent } from './dept-detail/dept-detail.component';

//full vs prefix
const routes: Routes = [
  { path : '', redirectTo: '/departments', pathMatch: 'full'},
  { path : 'departments', component: DeptlistComponent},
  { path : 'departments/:id', component: DeptDetailComponent},
  { path : 'employees', component: EmplistComponent},
  { path : '**', component: PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
