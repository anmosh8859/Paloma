package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Like {

    public Like() {
    }

    public Like(Integer likeid, Integer userid, Integer postid, LocalDate timestamp) {
        this.likeid = likeid;
        this.userid = userid;
        this.postid = postid;
        this.timestamp = timestamp;
    }

    @Id
    private Integer likeid;
    private Integer userid;
    private Integer postid;
    private LocalDate timestamp;

    public Integer getLikeid() {
        return likeid;
    }

    public void setLikeid(Integer likeid) {
        this.likeid = likeid;
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

    public LocalDate getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDate timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Like{" +
                "likeid=" + likeid +
                ", userid=" + userid +
                ", postid=" + postid +
                ", timestamp=" + timestamp +
                '}';
    }
}
