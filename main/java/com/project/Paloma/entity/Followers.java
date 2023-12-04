package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
public class Followers {

    public Followers() {
    }

    public Followers(Integer followerid, Integer userid, Integer followeruserid, LocalDateTime timestamp) {
        this.followerid = followerid;
        this.userid = userid;
        this.followeruserid = followeruserid;
        this.timestamp = timestamp;
    }

    @Id
    private Integer followerid;
    private Integer userid;
    private Integer followeruserid;
    private LocalDateTime timestamp;

    public Integer getFollowerid() {
        return followerid;
    }

    public void setFollowerid(Integer followerid) {
        this.followerid = followerid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFolloweruserid() {
        return followeruserid;
    }

    public void setFolloweruserid(Integer followeruserid) {
        this.followeruserid = followeruserid;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Followers{" +
                "followerid=" + followerid +
                ", userid=" + userid +
                ", followeruserid=" + followeruserid +
                ", timestamp=" + timestamp +
                '}';
    }
}
