import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CardComponent } from './pages/card/card.component';
import { FiatComponent } from './pages/fiat/fiat.component';
import { FordComponent } from './pages/ford/ford.component';
import { AudiComponent } from './pages/audi/audi.component';

const routes: Routes = [
{
  path:'',
  component: CardComponent
},
{
  path:'fiat',
  component: FiatComponent
},
{
  path:'ford',
  component: FordComponent
},
{
  path:'audi',
  component: AudiComponent
}





];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
