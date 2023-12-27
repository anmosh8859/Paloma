package com.project.Paloma.controllers;

import com.project.Paloma.entity.LoginCredentials;
import com.project.Paloma.entity.Post;
import com.project.Paloma.entity.User;
import com.project.Paloma.repository.LoginRepository;
import com.project.Paloma.repository.UserRepository;
import com.project.Paloma.service.PostServices;
import com.project.Paloma.service.UserServices;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

@Controller
@SessionAttributes("id")
public class TimelineController {

    public TimelineController(UserServices userServices, PostServices postServices, LoginRepository loginRepository, UserRepository userRepository) {
        this.userServices = userServices;
        this.postServices = postServices;
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    UserServices userServices;
    PostServices postServices;
    LoginRepository loginRepository;
    UserRepository userRepository;
    @RequestMapping("/timeline")
    public String showMainPage(ModelMap map){
        if(map.get("id")==null) return "redirect:login";
        LoginCredentials loginCredentials = loginRepository.findById((String) map.get("id")).orElse(null);

        User user = userRepository.findById((String) map.get("id")).orElse(null);
        List<Post> posts = postServices.showAllPostsOfId((String) map.get("id"));
        map.addAttribute("posts",posts);
        System.out.println();
        System.out.println(posts);
        System.out.println();

        map.put("user",user);
        if(loginCredentials!=null){
            if(!loginCredentials.getLpassword().equals("")){
                System.out.println();
                System.out.println("I am the main page");
                System.out.println();
                return "timeline";
            }
        }
        System.out.println();
        System.out.println("I am going to login...");
        System.out.println();
        return "redirect:login";
    }

//    @RequestMapping(value = "create-post", method = RequestMethod.POST)
//    public String createPost(ModelMap map, @RequestParam("postdata") String postdata, @RequestParam("image") MultipartFile file) throws IOException {
//        postServices.createPost(file,postdata, (String) map.get("id"));
//        return "redirect:timeline";
//    }
}
