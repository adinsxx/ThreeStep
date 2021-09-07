package my.wctc.edu.threestep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ThreeStepHomeController {
    @RequestMapping("/")
    public String homePage(){
        return "index";
    }
}

