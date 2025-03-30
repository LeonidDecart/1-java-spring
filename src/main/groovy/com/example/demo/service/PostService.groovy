package com.example.demo.service

import com.example.demo.model.Post
import org.springframework.stereotype.Service

@Service
class PostService {
    public ArrayList<Post> listAllPosts() {
        ArrayList<Post> posts = new ArrayList<>();
        for (int i=1; i<=3; i++) {
            posts.add(new Post("Пост №"+i));
        }
        return posts;
    }
}
