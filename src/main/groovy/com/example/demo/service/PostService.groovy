package com.example.demo.service

import com.example.demo.model.Post
import org.springframework.stereotype.Service

@Service
class PostService {
    ArrayList<Post> posts;

    public PostService(){
        posts = new ArrayList<>();
        for (int i=1; i<=3; i++) {
            posts.add(new Post(new Date(), "Пост №"+i));
        }
    }

    public ArrayList<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(new Date(), text));
    }
}
