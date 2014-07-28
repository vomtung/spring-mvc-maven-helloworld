package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping(value = "/hello")
public class HelloController {

	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		return "index";
	}

}
