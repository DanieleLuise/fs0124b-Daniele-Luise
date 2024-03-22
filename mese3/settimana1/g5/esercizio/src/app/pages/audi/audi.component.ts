import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';
import { AutoService } from '../../auto.service';

@Component({
  selector: 'app-audi',
  templateUrl: './audi.component.html',
  styleUrl: './audi.component.scss'
})
export class AudiComponent {

  audi:iAuto[] = []
  constructor(private autoSvc:AutoService){}

  ngOnInit(){
    this.autoSvc.getAudiAuto()
    .then(res => this.audi = res)
  }

}
