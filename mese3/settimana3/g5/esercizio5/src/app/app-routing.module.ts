import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
 { path: 'film', loadChildren: () => import('./pagine/film/film.module').then(m => m.FilmModule) },
 { path: 'utenti', loadChildren: () => import('./pagine/utenti/utenti.module').then(m => m.UtentiModule) },
 { path: 'profilo', loadChildren: () => import('./pagine/profilo/profilo.module').then(m => m.ProfiloModule) }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
