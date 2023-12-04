package com.project.Paloma.controllers;

import com.project.Paloma.entity.LoginCredentials;
import com.project.Paloma.entity.User;
import com.project.Paloma.repository.LoginRepository;
import com.project.Paloma.repository.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.List;

@Controller
@SessionAttributes("id")
public class ViewController {
    public ViewController(LoginRepository loginRepository, UserRepository userRepository) {
        this.loginRepository = loginRepository;
        this.userRepository = userRepository;
    }
    private LoginRepository loginRepository;
    private UserRepository userRepository;

    @RequestMapping("home")
    public String showHome() {
        return "home";
    }
}
