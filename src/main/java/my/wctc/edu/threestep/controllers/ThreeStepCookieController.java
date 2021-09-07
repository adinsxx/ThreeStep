package my.wctc.edu.threestep.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cookies")
public class ThreeStepCookieController {
    @RequestMapping("/ingredients")
    public String ingredientsList(){
        return "pages/TutorialStepOne";
    }
    @RequestMapping("/baking")
    public String bakingInstructions(){
        return "pages/TutorialStepTwo";
    }
    @RequestMapping("/storage")
    public String postBaking(){
        return "pages/TutorialStepThree";
    }

}
