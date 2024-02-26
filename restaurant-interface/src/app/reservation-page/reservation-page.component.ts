import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ReservationService } from '../services/reservation.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-reservation-page',
  templateUrl: './reservation-page.component.html',
  styleUrl: './reservation-page.component.scss'
})
export class ReservationPageComponent {

  title = "Reservation"
  nameReservation : string = "Enter name"
  date : Date = new Date("01/11/2024");
  hour : number = 4
  capacity : number = 2

  constructor(private reservationServ: ReservationService, private router: Router, private snackBar: MatSnackBar){}
  
  redirectToHome() {
    this.router.navigateByUrl('/home');
  }

  makeTheReservation() {
  this.reservationServ.createReservation(this.nameReservation, this.date, this.hour, this.capacity).subscribe(
    (createdReservation) => {
      this.showSuccessSnackBar('Reservation created successfully');
    },
    (error) => {
      this.showErrorSnackBar('Error creating reservation: No available tables for the given capacity at the specified date and hour');
    }
  );
}

private showSuccessSnackBar(message: string) {
  this.snackBar.open(message, 'Close', {
    duration: 3000,
    panelClass: ['success-snackbar'],
  });
}

private showErrorSnackBar(message: string) {
  this.snackBar.open(message, 'Close', {
    duration: 5000,
    panelClass: ['error-snackbar'],
  });
}

}
