package com.project.Paloma.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class User {

    public User() {
    }

    public User(String email, String username, String name, int age, String password, String gender, String bio, String profilepicture) {
        this.email = email;
        this.username = username;
        this.name = name;
        this.age = age;
        this.password = password;
        this.gender = gender;
        this.bio = bio;
        this.profilepicture = profilepicture;
    }

    @Id
    private String email;
    private String username;
    private String name;
    private int age;
    private String password;
    private String gender;
    private String bio;
    private String profilepicture;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public String getProfilepicture() {
        return profilepicture;
    }

    public void setProfilepicture(String profilepicture) {
        this.profilepicture = profilepicture;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", bio='" + bio + '\'' +
                ", profilepicture='" + profilepicture + '\'' +
                '}';
    }
}
