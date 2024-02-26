import { Component } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-check-page',
  templateUrl: './check-page.component.html',
  styleUrl: './check-page.component.scss'
})
export class CheckPageComponent {
  title = "Check"

  constructor(private router: Router){}
  
  redirectToHome() {
    this.router.navigateByUrl('/home');
  }
}
