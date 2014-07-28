package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/home")
public class HomeController {

    public HomeController() {
    }

    @RequestMapping(method = RequestMethod.GET)
    public String index() {    	
    	
        return "index";
    }

    @RequestMapping(value = "/aboutus", method = RequestMethod.GET)
    public String aboutus() {
        return "aboutus";
    }

    @RequestMapping(value = "/category", method = RequestMethod.GET)
    public String category() {
        return "category";
    }

    @RequestMapping(value = "/specials", method = RequestMethod.GET)
    public String specials() {
        return "specials";
    }

    @RequestMapping(value = "/myaccount", method = RequestMethod.GET)
    public String myaccount() {
        return "myaccount";
    }
    
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String register() {
        return "register";
    }
    
    @RequestMapping(value = "/details", method = RequestMethod.GET)
    public String details() {
        return "details";
    }
    
    @RequestMapping(value = "/contact", method = RequestMethod.GET)
    public String contact() {
        return "contact";
    }
    
    @RequestMapping(value = "/cart", method = RequestMethod.GET)
    public String cart() {
        return "cart";
    }
    
}