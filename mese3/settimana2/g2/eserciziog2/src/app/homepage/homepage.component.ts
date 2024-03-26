import { PostInterface } from '../../interfaces/post.interface';
import { PostService } from './../post.service';
import { Component } from '@angular/core';


@Component({
  selector: 'app-homepage',
  templateUrl: './homepage.component.html',
  styleUrls: ['./homepage.component.scss'],
})
export class HomepageComponent {
  post!: PostInterface;
  related!: PostInterface[];


  constructor(private PostSvc:PostService) {
    this.post = this.PostSvc.getTopPost()
    this.related = this.PostSvc.getRandomPosts(4)
  }
  editPost() {
    alert("Edit successful!")
  }

}
