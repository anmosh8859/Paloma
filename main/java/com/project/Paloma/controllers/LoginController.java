package com.project.Paloma.controllers;

import com.project.Paloma.entity.LoginCredentials;
import com.project.Paloma.entity.User;
import com.project.Paloma.repository.LoginRepository;
import com.project.Paloma.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@SessionAttributes("id")
public class LoginController {

    public LoginController(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }

    private LoginRepository loginRepository;
    private UserRepository userRepository;

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String loginSignUp(ModelMap map) {
        LoginCredentials log = loginRepository.findAll().stream().filter(loginCredentials -> !loginCredentials.getLpassword().equals("")).findFirst().orElse(null);
        System.out.println(log);
        if(log!=null){
            map.put("id",log.getLemail());
            return "redirect:";
        }
        User user = new User();
        List<LoginCredentials> loginCredentials = loginRepository.findByRemember("remember");
        LoginCredentials login = loginCredentials.stream().findFirst().orElse(new LoginCredentials());
        login.setLpassword("");
        login.setRemember("");
        map.put("login",login);
        map.put("user", user);
        return "index";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String signUp(ModelMap map, LoginCredentials login, BindingResult result) {
        System.out.println(login);
        User user = userRepository.findByEmailAndPassword(login.getLemail(), login.getLpassword());
        System.out.println(user);
        if(user==null){
            map.addAttribute("errorMessage","Bad Credentials");
            System.out.println("nullllllll");
            user = new User();
            login = new LoginCredentials();
            map.put("login",login);
            map.put("user", user);
            return "index";
        } else{
            map.put("id",login.getLemail());
            loginRepository.save(login);
            return "redirect:";
        }
    }

    @RequestMapping("logout")
    public String logout(ModelMap map){
        LoginCredentials loginCredentials = loginRepository.findAll().stream().filter(loginCredentials1 -> !loginCredentials1.getLpassword().equals("")).findFirst().orElse(null);
        loginRepository.delete(loginCredentials);
        loginCredentials.setLpassword("");
        loginRepository.save(loginCredentials);
        return "redirect:home";
    }

//    @RequestMapping("validate-email")
//    public @ResponseBody String validateEmail(@RequestParam("lemail") String lemail){
//        User user = userRepository.findById(lemail).get();
//        if(user == null){
//            return "Email id not registered...";
//        } else return "";
//    }
//
//    @RequestMapping("validate-password")
//    public @ResponseBody String validatePassword(@RequestParam("lemail") String lemail, @RequestParam("lpassword") String lpassword) {
//        User user = userRepository.findById(lemail).get();
//        if (lpassword.equals(user.getPassword())) {
//            return "";
//        } else return "Incorrect password please try again...";
//    }
}
