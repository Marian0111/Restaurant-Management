import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Order } from '../types/order';
import { Observable, catchError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class OrderService {
  private apiUrl = 'http://localhost:8080/orders';

  constructor(private http: HttpClient) {
  }

  placeOrder(productNames: string[], productQuantities: number[], tableNumber: number): Observable<Order> {
    const body = {
      productNames: productNames,
      productQuantities: productQuantities,
      tableNumber: tableNumber,
    };
    return this.http.post<Order>(this.apiUrl, body).pipe(
      catchError((error) => {
        console.error('Error creating reservation:', error);
        throw error;
      })
    );
  }
}
