package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private Long id;
    private String text;
    private Integer likes;

    private Date creationDate;

    public Long getId() {
        return id;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes){
        this.likes = likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public Post(Long id, String text, Date creationDate){
        this.text = text;
        this.likes = 0;
        this.creationDate = creationDate;
        this.id = id;
    }
}
