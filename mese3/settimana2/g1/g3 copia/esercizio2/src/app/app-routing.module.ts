import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { ActiveComponent } from './component/active/active.component';
import { InactiveComponent } from './component/inactive/inactive.component';

const routes: Routes = [

{
  path:'',
  component: HomeComponent
},
{
  path:'active',
  component: ActiveComponent
},
{
  path:'inactive',
  component: InactiveComponent
},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
