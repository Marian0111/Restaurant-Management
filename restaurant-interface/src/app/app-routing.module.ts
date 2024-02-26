import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { MenuPageComponent } from './menu-page/menu-page.component';
import { OrderPageComponent } from './order-page/order-page.component';
import { ReservationPageComponent } from './reservation-page/reservation-page.component';
import { CheckPageComponent } from './check-page/check-page.component';

const routes: Routes = [
  {path: '', component: HomePageComponent},
  {path: 'menu', component: MenuPageComponent},
  {path: 'home', component: HomePageComponent},
  {path: 'order', component: OrderPageComponent},
  {path: 'check', component: CheckPageComponent},
  {path: 'reservation', component: ReservationPageComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
