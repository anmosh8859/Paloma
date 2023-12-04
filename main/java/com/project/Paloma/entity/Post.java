package com.project.Paloma.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Post {

    public Post() {
    }

    public Post(Integer postid, String userid, String post, String imagepath) {
        this.postid = postid;
        this.userid = userid;
        this.post = post;
        this.imagepath = imagepath;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postid;
    @Column(name="userid")
    private String userid;
    @Column(name="post")
    private String post;
    @Column(name = "imagepath")
    private String imagepath;
    @Column(name = "timestamp")
    private LocalDateTime timestamp;

    @PrePersist
    protected void onCreate() {
        timestamp = LocalDateTime.now();
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postid=" + postid +
                ", userid=" + userid +
                ", imagepath='" + imagepath + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}
