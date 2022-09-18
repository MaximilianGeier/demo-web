package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {
    static List<Post> posts = new ArrayList<>();

    public void create(String text) {
        posts.add(new Post(text, new Date()));
    }
    public List<Post> listAllPosts(){
        if (posts.size() > 0){
            return posts;
        }
        else{
            return List.of(new Post("no posts"));
        }
    }
}
