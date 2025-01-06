package com.example.thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class MainController {

    @GetMapping("/home")
    public String loadHome(Model model){
        //Model is a part of org.springframework.ui
        model.addAttribute("name","Thymeleaf");
        return "home";
    }

    @GetMapping("/elvis")
    public String elvisexample(Model model){
        model.addAttribute("isadmin","true");
        model.addAttribute("gender","F");


        return "elvis";
    }

    @GetMapping("/each")
    public String eachExample(Model model){
        //Model is a part of org.springframework.ui
        List<String> stringList = List.of("First","Second","Third");
        model.addAttribute("list",stringList);
        return "each";//refers to the html file
    }

    /*
    * Three conditional statements for thymeleaf
    * Elvis operator
    * If unless
    * Switch case*/
}
