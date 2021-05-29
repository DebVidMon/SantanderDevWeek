import { DashboardPageComponent } from './dashboard-page/dashboard-page.component';
import { HttpClientModule } from '@angular/common/http';
import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { CardComponent } from './card/card.component';



@NgModule({
  declarations: [
    DashboardPageComponent,
    CardComponent,
  ],
  imports: [
    CommonModule,
    HttpClientModule,
  ],
})
export class DashboardModule { }
