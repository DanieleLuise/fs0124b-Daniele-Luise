import { Component } from '@angular/core';
import { iPost } from './Models/post';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss'
})
export class AppComponent {
  title = 'esercizio2';

  postArr:iPost[] = [];

  ngOnInit(){

    fetch('../assets/db.json')
    .then(post => post.json())
    .then(post => {
      this.postArr = post.posts
      this.generaRandomArray()
    })

  }
  soloDisponibili(){
    this.postArr = this.postArr.filter(p => p.active)
  }
  generaNumero(){
    let index:number = Math.floor(Math.random() * this.postArr.length)
    return index
  }

  randomArray:iPost[] = []

 generaRandomArray(){
  for(let i = 0; i < 4; i++){
    this.randomArray.push(this.postArr[this.generaNumero()])
  }

 }

}
