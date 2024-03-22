import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';
import { AutoService } from '../../auto.service';

@Component({
  selector: 'app-fiat',
  templateUrl: './fiat.component.html',
  styleUrl: './fiat.component.scss'
})
export class FiatComponent {

  fiat:iAuto[] = []
  constructor(private autoSvc:AutoService){}

  ngOnInit(){
    this.autoSvc.getFiatAuto()
    .then(res => this.fiat = res)
  }

}
