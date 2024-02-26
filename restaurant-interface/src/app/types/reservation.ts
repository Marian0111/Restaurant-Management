export class Reservation {
    name: string;
    date: Date;
    hour: number;
  
    constructor(name: string, price: number, date: Date, hour: number) {
      this.name = name;
      this.date = date;
      this.hour = hour;
    }
  }
  