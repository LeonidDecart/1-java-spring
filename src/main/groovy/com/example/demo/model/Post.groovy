package com.example.demo.model

class Post {
    private Long id;
    private Date creationDate;
    private String text;
    private Integer likes;

    public Post(Long id, Date creationDate, String text) {
        this.id = id;
        this.creationDate = creationDate;
        this.text = text;
        likes = 0;
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
