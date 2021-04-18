package org.launchcode.formsexamples.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping
    public String index(Model model){
        String title = "Code Events";
        model.addAttribute("title", title);
        return "index";
    }


}
