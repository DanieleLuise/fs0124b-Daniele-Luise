import { Component, OnInit } from '@angular/core';

import { PostService } from '../post.service';
import { PostInterface } from '../../interfaces/post.interface';

@Component({
  selector: 'app-active-posts',
  templateUrl: './active-posts.component.html',
  styleUrls: ['./active-posts.component.scss'],
})
export class ActivePostsComponent {
  posts: PostInterface[] = [];

  constructor(private postSvc:PostService) {
    this.posts = this.postSvc.getActivePosts()
  }

}
