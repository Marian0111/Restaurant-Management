import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError } from 'rxjs';
import { Reservation } from '../types/reservation';

@Injectable({
  providedIn: 'root'
})
export class ReservationService {
  private apiUrl = 'http://localhost:8080/reservations';

  constructor(private http: HttpClient) {
  }

  createReservation(name: string, date: Date, hour: number, capacity: number): Observable<Reservation> {
    const body = {
      reservationName: name,
      reservationDate: date,
      reservationHour: hour,
      capacity: capacity,
    };
    return this.http.post<Reservation>(this.apiUrl, body).pipe(
      catchError((error) => {
        console.error('Error creating reservation:', error);
        throw error;
      })
    );
  }
}

