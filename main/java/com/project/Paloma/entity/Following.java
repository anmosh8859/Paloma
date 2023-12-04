package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.time.LocalDateTime;

@Entity
public class Following {

    public Following() {
    }

    public Following(Integer followingid, Integer userid, Integer followinguserid, LocalDateTime timestamp) {
        this.followingid = followingid;
        this.userid = userid;
        this.followinguserid = followinguserid;
        this.timestamp = timestamp;
    }

    @Id
    private Integer followingid;
    private Integer userid;
    private Integer followinguserid;
    private LocalDateTime timestamp;

    public Integer getFollowingid() {
        return followingid;
    }

    public void setFollowingid(Integer followingid) {
        this.followingid = followingid;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getFollowinguserid() {
        return followinguserid;
    }

    public void setFollowinguserid(Integer followinguserid) {
        this.followinguserid = followinguserid;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(LocalDateTime timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return "Following{" +
                "followingid=" + followingid +
                ", userid=" + userid +
                ", followinguserid=" + followinguserid +
                ", timestamp=" + timestamp +
                '}';
    }
}
