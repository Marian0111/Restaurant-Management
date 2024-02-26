import { Component, OnInit } from '@angular/core';
import { ProductService } from '../services/product.service';
import { Product } from '../types/product';
import { Router } from '@angular/router';

@Component({
  selector: 'app-menu-page',
  templateUrl: './menu-page.component.html',
  styleUrls: ['./menu-page.component.scss']
})
export class MenuPageComponent implements OnInit{
  productList: Product[] = [];
  title = 'Menu';
  categories = [
    'PIZZA',
    'PASTA',
    'TEA',
    'COFFEE',
    'REFRESHER',
    'SODA',
    'ALCOHOL'
  ];

  constructor(public prodServ: ProductService, private router: Router) {}
  ngOnInit() {
    this.getProducts();
  }

  getProducts(){
    this.prodServ.getProducts().subscribe((res) => {
      this.productList = res;
    });
  }

  getProductList(category: string){
    return this.productList.filter(p => p.category === category);
  }

  redirectToHome() {
    this.router.navigateByUrl('/home');
  }
}
