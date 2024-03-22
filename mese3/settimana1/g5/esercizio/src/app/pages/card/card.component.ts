import { Component } from '@angular/core';
import { iAuto } from '../../Models/auto';
import { AutoService } from '../../auto.service';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrl: './card.component.scss'
})
export class CardComponent {

  autoArr:iAuto[] = [];
  autoHome:iAuto[] = []
  constructor(private autoSvc:AutoService){}


ngOnInit(){
  this.autoSvc.getAllAuto().then(res => {

    this.autoArr = res;
    this.generaAutoCasuali()

  })
}

generaAutoCasuali():void{
  for (let i = 0; i < 2; i++){
    let index:number = Math.floor(Math.random() * this.autoArr.length)
    this.autoHome.push(this.autoArr[index])
  }
}

}
