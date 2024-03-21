import { Component } from '@angular/core';
import { iPost } from '../../Models/post';
import { PostService } from '../../post.service';

@Component({
  selector: 'app-active',
  templateUrl: './active.component.html',
  styleUrl: './active.component.scss'
})
export class ActiveComponent {
  postArr:iPost[] = [];
  constructor(private postSvc:PostService){}
  ngOnInit(){

    this.postSvc.getActivePost().then(res =>{
      this.postArr = res
    }
      )


  }
}



