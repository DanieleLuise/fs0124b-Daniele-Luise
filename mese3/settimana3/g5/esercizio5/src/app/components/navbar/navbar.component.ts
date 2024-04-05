import { Component } from '@angular/core';

@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrl: './navbar.component.scss'
})
export class NavbarComponent {

  title = 'bootstrap';

  show:boolean = false
  isCollapsed = false;
  isUserLoggedIn:boolean = false;



}
