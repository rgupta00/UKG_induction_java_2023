import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { FormsModule } from '@angular/forms';
import { CalComponent } from './cal/cal.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeTitlePipe } from './employee-title.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    CalComponent,
    EmployeelistComponent,
    EmployeeTitlePipe
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
//provider container services*--> used to fetch the data from the backend
