package com.project.Paloma.controllers;

import com.project.Paloma.entity.LoginCredentials;
import com.project.Paloma.entity.User;
import com.project.Paloma.repository.LoginRepository;
import com.project.Paloma.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Controller
@SessionAttributes("id")
public class UserController {

    public UserController(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    private LoginRepository loginRepository;
    private UserRepository userRepository;

    @RequestMapping(value = "userCreate", method = RequestMethod.POST)
    public String signUp(ModelMap map, @RequestParam String cnfPass, User user) {
        if(!user.getPassword().equals(cnfPass)) return "redirect:login";
        System.out.println(user);
        userRepository.save(user);
        return "redirect:home";
    }

    @RequestMapping("editUser")
    public String showEditProfile(ModelMap map){
        LoginCredentials loginCredentials = loginRepository.findAll().stream().filter(loginCredentials1->!loginCredentials1.getLpassword().equals("")).findFirst().orElse(null);
        if(loginCredentials!=null){
            if(!loginCredentials.getLpassword().equals("")){
                User user = userRepository.findById(loginCredentials.getLemail()).orElse(null);
                map.put("user",user);
                return "editProfile";
            }
        }
        return "redirect:login";
    }

    @RequestMapping(value = "change-profile-pic", method = RequestMethod.POST)
    public String changeProfilePicture(ModelMap map, @RequestParam("picture") MultipartFile file) throws IOException {
        User user = userRepository.findById((String) map.get("id")).orElse(null);
        userRepository.delete(user);
        user.setProfilepicture("post-images/"+file.getOriginalFilename());
        userRepository.save(user);
        file.transferTo(new File("D:/Study Material/MCA/Samester - III/Web/Paloma/src/main/resources/static/post-images/"
                + file.getOriginalFilename()));
        return "redirect:editUser";
    }
    @RequestMapping(value = "change-name", method = RequestMethod.POST)
    public String changeName(@RequestParam("name") String name, ModelMap map){
        User user = userRepository.findById((String) map.get("id")).orElse(null);
        userRepository.delete(user);
        user.setName(name);
        userRepository.save(user);
        return "redirect:editUser";
    }

    @RequestMapping(value = "change-bio", method = RequestMethod.POST)
    public String changeBio(@RequestParam("bio") String bio, ModelMap map){
        User user = userRepository.findById((String) map.get("id")).orElse(null);
        userRepository.delete(user);
        user.setBio(bio);
        userRepository.save(user);
        return "redirect:editUser";
    }

    @RequestMapping("settings")
    public String showSettings(ModelMap map){
        LoginCredentials loginCredentials = loginRepository.findById((String) map.get("id")).orElse(null);
        if(loginCredentials!=null){
            if(!loginCredentials.getLpassword().equals("")){
                return "settings";
            }
        }
        return "redirect:login";
    }

    @RequestMapping(value = "change-password", method = RequestMethod.POST)
    public String changePassword(@RequestParam("currPass") String currPass, @RequestParam("newPass") String pass, @RequestParam("cnfPass") String cnfPass, ModelMap map){
        User user = userRepository.findById((String) map.get("id")).orElse(null);
        if(user.getPassword().equals(currPass)){
            if(pass.equals(cnfPass)){
                userRepository.delete(user);
                user.setPassword(pass);
                userRepository.save(user);
                LoginCredentials loginCredentials = loginRepository.findAll().stream().findFirst().orElse(null);
                loginRepository.delete(loginCredentials);
                loginCredentials.setLpassword(pass);
                loginRepository.save(loginCredentials);
                return "redirect:logout";
            } else map.addAttribute("error","New Password and Confirm Password does not match");
        } else map.addAttribute("error","Incorrect old Password");
        return "settings";
    }

    @RequestMapping("delete-user")
    public String deleteUser(ModelMap map){
        User user = userRepository.findById((String) map.get("id")).orElse(null);
        userRepository.delete(user);
        LoginCredentials loginCredentials = loginRepository.findById((String) map.get("id")).orElse(null);
        loginRepository.delete(loginCredentials);
        return "redirect:logout";
    }

}