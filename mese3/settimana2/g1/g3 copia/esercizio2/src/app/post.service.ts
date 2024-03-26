import { Injectable } from '@angular/core';
import { iPost } from './Models/post';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  getAllPost():Promise<iPost[]>{

  return fetch('../assets/db.json')
    .then(post => post.json())
    .then(post =>  post.posts

    )}
    getActivePost():Promise<iPost[]>{

      return fetch('../assets/db.json')
        .then(res => res.json())
        .then(res=>res.posts.filter((p:iPost)=>p.active))
     }

     getInactivePost():Promise<iPost[]>{
      return fetch('../assets/db.json')
        .then(res => res.json())
        .then(res=>res.posts.filter((p:iPost)=>!p.active))
     }


}
