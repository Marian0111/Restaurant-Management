import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { MenuPageComponent } from './menu-page/menu-page.component';
import { HttpClientModule} from '@angular/common/http';
import { HomePageComponent } from './home-page/home-page.component';
import { ReservationPageComponent } from './reservation-page/reservation-page.component';
import { OrderPageComponent } from './order-page/order-page.component';
import { CheckPageComponent } from './check-page/check-page.component';
import { FormsModule } from '@angular/forms';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MatSnackBarModule } from '@angular/material/snack-bar';

@NgModule({
  declarations: [
    AppComponent,
    MenuPageComponent,
    HomePageComponent,
    ReservationPageComponent,
    OrderPageComponent,
    CheckPageComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
    BrowserAnimationsModule,
    MatSnackBarModule,
  ],
  providers: [
    provideClientHydration(),
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
