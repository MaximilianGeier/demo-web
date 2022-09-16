package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {
    List<Post> posts = new ArrayList<>();

    public void add(String text){
        this.posts.add(new Post(text));
    }
    public List<Post> listAllPosts(){
        if (posts.size() >= 3){
            return posts.subList(0, 2);
        }
        else{
            List<Post> result = Arrays.asList(new Post("no posts"), new Post("еще no posts"),
                                              new Post("и еще no posts"));
            return result;
        }
    }
}
