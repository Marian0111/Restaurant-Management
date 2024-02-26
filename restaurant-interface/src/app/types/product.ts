export class Product {
    name: string;
    price: number;
    weight: number;
    category: string;
    quantity: number;
  
    constructor(name: string, price: number, weight: number, category: string) {
      this.name = name;
      this.price = price;
      this.weight = weight;
      this.category = category;
      this.quantity = 0;
    }
  }
  