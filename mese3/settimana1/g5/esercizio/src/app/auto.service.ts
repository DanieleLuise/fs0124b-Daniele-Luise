import { Injectable } from '@angular/core';
import { iAuto } from './Models/auto';

@Injectable({
  providedIn: 'root'
})
export class AutoService {

  getAllAuto():Promise<iAuto[]>{
    return fetch('../assets/db.json')
    .then(res => res.json())
    .then((res:iAuto[]) => res)
  }
  getActiveAuto():Promise<iAuto[]>{
    return this.getAllAuto()
    .then(res => res.filter(p => p.available))
  }
  getFiatAuto():Promise<iAuto[]>{
    return this.getAllAuto()
    .then(res => res.filter(a => a.brand === 'Fiat'))
  }
  getFordAuto():Promise<iAuto[]>{
    return this.getAllAuto()
    .then(res => res.filter(a => a.brand === 'Ford'))
  }
  getAudiAuto():Promise<iAuto[]>{
    return this.getAllAuto()
    .then(res => res.filter(a => a.brand === 'Audi'))
  }

}
