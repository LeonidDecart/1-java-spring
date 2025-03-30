package com.example.demo.model

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Post implements Serializable {
    @Id
    @GeneratedValue
    private Long id;
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post() {
    }

    public Post(final Long id, final String text, final Date date) {
        this.id = id;
        this.text = text;
        this.creationDate = date;
        this.likes = 0;
    }

    public Long getId(){
        return id;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
