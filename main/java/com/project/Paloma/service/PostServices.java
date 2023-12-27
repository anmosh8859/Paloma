package com.project.Paloma.service;

import com.project.Paloma.entity.Post;
import com.project.Paloma.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

@Service
public class PostServices {
    @Autowired
    PostRepository repository;

    public void createPost(MultipartFile file, String postdata, String userid) throws IOException {
        String filepath = "D:/Study Material/MCA/Samester - III/Web/Paloma/src/main/resources/static/post-images/";
        Post post = new Post(123,userid,postdata,"post-images/" + file.getOriginalFilename());
        System.out.println("Transferring file...");
        file.transferTo(new File(filepath+ file.getOriginalFilename()));
        System.out.println("saving file...");
        repository.save(post);
        System.out.println("\n"+post+"\n");
    }

    public List<Post> showAllPostsOfId(String userid){
        return repository.findByUserid(userid);
    }
    public List<Post> getAllPosts(){
        return repository.findAll();
    }

//    public void retievePost(String postid){
//
//    }
}
