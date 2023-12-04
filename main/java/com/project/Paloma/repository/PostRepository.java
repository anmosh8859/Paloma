package com.project.Paloma.repository;

import com.project.Paloma.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Integer> {
    public List<Post> findByUserid(String userid);
}
