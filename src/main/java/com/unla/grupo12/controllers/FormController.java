package com.unla.grupo12.controllers;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.unla.grupo12.models.User;

@Controller
@RequestMapping("/")
public class FormController {
    @GetMapping("form")
    public String form(){
        return "form/form";
    }

    @PostMapping("/register")
    public String userRegistration(@ModelAttribute User user){
        System.out.println(user.toString());
        return "form/form";
    }
}
