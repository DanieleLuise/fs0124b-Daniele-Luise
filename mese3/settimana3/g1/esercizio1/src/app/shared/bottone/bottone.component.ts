import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-bottone',
  templateUrl: './bottone.component.html',
  styleUrl: './bottone.component.scss'
})
export class BottoneComponent {
   @Input() testo!:string;
}
