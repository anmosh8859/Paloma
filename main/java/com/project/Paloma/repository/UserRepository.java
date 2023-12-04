package com.project.Paloma.repository;

import com.project.Paloma.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    public User findByEmailAndPassword(String email,String password);
}