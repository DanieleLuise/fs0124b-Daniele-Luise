import { Component } from '@angular/core';
import { PostService } from '../../post.service';
import { iPost } from '../../Models/post';

@Component({
  selector: 'app-inactive',
  templateUrl: './inactive.component.html',
  styleUrl: './inactive.component.scss'
})
export class InactiveComponent {
  postArr:iPost[] = [];
  constructor(private postSvc:PostService){}
  ngOnInit(){

    this.postSvc.getInactivePost().then(res =>{
      this.postArr = res
    }
      )


  }
}
