import { NgModule, Component } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { PreferitiComponent } from './component/preferiti/preferiti.component';

const routes: Routes = [
  {
    path:'',
    component: HomeComponent
  },
  {
    path:'add preferiti',
    component: PreferitiComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
