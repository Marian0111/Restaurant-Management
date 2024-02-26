import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Product } from '../types/product';
import { ProductService } from '../services/product.service';
import { OrderService } from '../services/order.service';
import { MatSnackBar } from '@angular/material/snack-bar';

@Component({
  selector: 'app-order-page',
  templateUrl: './order-page.component.html',
  styleUrl: './order-page.component.scss'
})
export class OrderPageComponent {

  productList: Product[] = [];

  title = 'Order'

  tableNumber = 1

  categories = [
    'PIZZA',
    'PASTA',
    'TEA',
    'COFFEE',
    'REFRESHER',
    'SODA',
    'ALCOHOL'
  ];

  constructor(private prodServ: ProductService, private router: Router, private ordServ: OrderService, private snackBar: MatSnackBar) {
  }
  ngOnInit() {
    this.getProducts();

  }

  getProducts(){
    this.prodServ.getProducts().subscribe((res) => {
      this.productList = res;
      this.productList.forEach(product => {
        product.quantity = 0;
      });
    });
  }

  getProductList(category: string){
    return this.productList.filter(p => p.category === category);
  }

  redirectToHome() {
    this.router.navigateByUrl('/home');
  }

  orderProducts() {
    const productNames: string[] = [];
    const productQuantities: number[] = [];
    this.productList.forEach(product => {
      if(product.quantity != 0){
        productNames.push(product.name)
        productQuantities.push(product.quantity)
      }
    });
    if(productNames.length == 0){
      this.showErrorSnackBar('Error creating order: No item selected');
    }else{
      this.ordServ.placeOrder(productNames, productQuantities, this.tableNumber).subscribe(
        (placedOrder) => {
          this.showSuccessSnackBar('Order placed successfully');
        },
        (error) => {
          this.showErrorSnackBar('Error creating order: No item selected');
        }
      );
    }
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
