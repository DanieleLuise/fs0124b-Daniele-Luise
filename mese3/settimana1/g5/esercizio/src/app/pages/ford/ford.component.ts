import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';
import { AutoService } from '../../auto.service';

@Component({
  selector: 'app-ford',
  templateUrl: './ford.component.html',
  styleUrl: './ford.component.scss'
})
export class FordComponent {
  ford:iAuto[] = []
  constructor(private autoSvc:AutoService){}

  ngOnInit(){
    this.autoSvc.getFordAuto()
    .then(res => this.ford = res)
  }
}
