package co.uk.lads.plurple.controller;

import co.uk.lads.plurple.service.DatabaseService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class HomeController {

    @Value("${spring.application.name}")
    String appName;

    @Value("http://www.squawka.com/en/wp-content/uploads/2018/07/GettyImages-993377656.jpg")
    String featuredApp2;

    @RequestMapping(path = "/")
    public String mapPage(Map<String,Object> map){
        DatabaseService databaseService = new DatabaseService();
        featuredApp2 = databaseService.getRandomEventImage();
        map.put("appName",appName);
        map.put("harryMaguire",featuredApp2);
        return "Home";
    }

}
