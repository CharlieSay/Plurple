package co.uk.lads.plurple.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    @Value("http://www.squawka.com/en/wp-content/uploads/2018/07/GettyImages-993377656.jpg")
    String featuredApp2;

    @RequestMapping(path = "/")
    public String mapPage(Model model){
        model.addAttribute("appName",appName);
        model.addAttribute("harryMaguire", featuredApp2);
        return "Home";
    }

}
