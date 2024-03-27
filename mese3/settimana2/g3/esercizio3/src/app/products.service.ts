import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

import { IProd } from './models/prod';

@Injectable({
  providedIn: 'root'
})
export class ProductsService {

  apiUrl:string = 'https://dummyjson.com/products'

  constructor(private http:HttpClient ) {}

     getAll(){
      return this.http.get<IProd>(this.apiUrl)
     }
}
