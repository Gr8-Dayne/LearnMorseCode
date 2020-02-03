package com.dass.LearnMorseCode.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.security.Principal;


@Controller
public class homeController {
    @GetMapping("/")
    public String getHome(Principal p, Model m){
        if(p != null){
            m.addAttribute("username", p.getName());
            m.addAttribute("action","/logout");
        } else {
            m.addAttribute("action","/login");
        }
        return "home";
    }
}