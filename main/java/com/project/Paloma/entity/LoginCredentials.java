package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class LoginCredentials {

    public LoginCredentials() {
    }

    public LoginCredentials(String lemail, String lpassword, String remember) {
        this.lemail = lemail;
        this.lpassword = lpassword;
        this.remember = remember;
    }

    @Id
    private String lemail;
    private String lpassword;
    private String remember;

    public String getLemail() {
        return lemail;
    }

    public void setLemail(String lemail) {
        this.lemail = lemail;
    }

    public String getLpassword() {
        return lpassword;
    }

    public void setLpassword(String lpassword) {
        this.lpassword = lpassword;
    }

    public String getRemember() {
        return remember;
    }

    public void setRemember(String remember) {
        this.remember = remember;
    }

    @Override
    public String toString() {
        return "LoginCredentials{" +
                "lemail='" + lemail + '\'' +
                ", lpassword='" + lpassword + '\'' +
                ", remember=" + remember +
                '}';
    }
}
