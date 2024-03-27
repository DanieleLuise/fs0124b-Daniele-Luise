import { ProductsService } from './../../products.service';
import { Component } from '@angular/core';
import { IProducts } from '../../models/i-products';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {

   prod:IProducts [] = []
   arrayPreferiti:IProducts[] = []

   constructor(private prodSvc:ProductsService){}
   ngOnInit(){
    this.prodSvc.getAll().subscribe(prod => {
      this.prod = prod.products
    })
  }


  aggiungiAiPreferiti(p: IProducts){
   this.arrayPreferiti.push(p);
  }



}
