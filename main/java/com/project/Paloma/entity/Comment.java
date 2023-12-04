package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Comment {

    public Comment() {
    }

    public Comment(Integer commentid, Integer userid, Integer postid, String commenttext, LocalDate timestamp) {
        this.commentid = commentid;
        this.userid = userid;
        this.postid = postid;
        this.commenttext = commenttext;
        this.timestamp = timestamp;
    }

    @Id
    private Integer commentid;
    private Integer userid;
    private Integer postid;
    private String commenttext;
    private LocalDate timestamp;

    public Integer getCommentid() {
        return commentid;
    }

    public void setCommentid(Integer commentid) {
        this.commentid = commentid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getPostid() {
        return postid;
    }

    public void setPostid(Integer postid) {
        this.postid = postid;
    }

    public String getCommenttext() {
        return commenttext;
    }

    public void setCommenttext(String commenttext) {
        this.commenttext = commenttext;
    }

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "commentid=" + commentid +
                ", userid=" + userid +
                ", postid=" + postid +
                ", commenttext='" + commenttext + '\'' +
                ", timestamp=" + timestamp +
                '}';
    }
}