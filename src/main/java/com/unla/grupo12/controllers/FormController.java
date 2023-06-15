package com.unla.grupo12.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

import com.unla.grupo12.models.UserModel;

@Controller
@RequestMapping("/")
public class FormController {
    @GetMapping("form")
    public String form(){
        return "form/form";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute UserModel user, Model model){
        System.out.println(user.toString());

        System.out.println(user.getFname());
        System.out.println(user.getLname());
        System.out.println(user.getBirth());
        System.out.println(user.getEmail());
        System.out.println(user.getGender());
        System.out.println(user.getPasswd());

        model.addAttribute("firstname", user.getFname());
        model.addAttribute("lastname", user.getLname());

        return "home/welcome";
    }
}
