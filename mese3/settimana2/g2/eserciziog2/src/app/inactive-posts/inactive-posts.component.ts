import { Component } from '@angular/core';

import { PostService } from '../post.service';
import { PostInterface } from '../../interfaces/post.interface';

@Component({
  selector: 'app-inactive-posts',
  templateUrl: './inactive-posts.component.html',
  styleUrls: ['./inactive-posts.component.scss']
})
export class InactivePostsComponent {
  posts!: PostInterface[];
  constructor(private postSvc:PostService) {
    this.posts = this.postSvc.getInactivePosts()
  }
}
