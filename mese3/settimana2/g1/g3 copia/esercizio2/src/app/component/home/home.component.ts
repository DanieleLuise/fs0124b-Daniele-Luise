import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostService } from '../../post.service';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrl: './home.component.scss'
})
export class HomeComponent {
  postArr:iPost[] = [];

  constructor(private postSvc:PostService) {}

  ngOnInit(){

    this.postSvc.getAllPost().then(res =>{
      this.postArr = res
    }
      )


  }
}
