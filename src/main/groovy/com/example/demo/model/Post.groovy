package com.example.demo.model

class Post {
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post(Date creationDate, String text) {
        this.creationDate = creationDate;
        this.text = text;
    }

    public String getText(){
        return text;
    }

    public Integer getLikes(){
        return likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }
}
