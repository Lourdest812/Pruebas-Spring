package com.unla.grupo12.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@RequestMapping("/")

public class HomeController {
    @GetMapping("/index")
    public String index(){
        return "home/index";
    }

    @GetMapping("/hello")
    public ModelAndView helloParams1(@RequestParam(name="name", required=false, defaultValue="null") String name){
        ModelAndView mV = new ModelAndView("home/hello");
        mV.addObject("name", name);
        return mV;
    }

    @GetMapping("hello/{name}")
    public ModelAndView helloParams2(@PathVariable("name") String name) {
        ModelAndView mV = new ModelAndView("home/hello");
        return mV;
    }
    
    @GetMapping("/")
    public RedirectView redirectToHomeIndex(){
        return new RedirectView("/index");
    }

    
    /* 
    @GetMapping("/degree")
        public String degree(Model model){
            //model.addAttribute("degree", new Degree());
            
        }*/
    
}
