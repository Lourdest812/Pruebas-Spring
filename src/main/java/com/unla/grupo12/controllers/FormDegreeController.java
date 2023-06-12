package com.unla.grupo12.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.unla.grupo12.helpers.ViewRouteHelper;
import com.unla.grupo12.models.Degree;

@Controller
@RequestMapping("/")
public class FormDegreeController {
    @GetMapping("/degree")
    public String degreeModel(Model model){
        model.addAttribute("degree", new Degree());
        return ViewRouteHelper.DEGREE;
    }

    @PostMapping("/newdegree")
    public ModelAndView newDegree(@ModelAttribute("degree") Degree degree){
        ModelAndView mV = new ModelAndView();
        mV.setViewName(ViewRouteHelper.NEW_DEGREE);
        mV.addObject("degree", degree);

        System.out.println(degree.getName());
        System.out.println(degree.getInstitution());
        System.out.println(degree.getYear());

        return mV;
    }
}
