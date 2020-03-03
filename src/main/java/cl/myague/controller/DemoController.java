package cl.myague.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DemoController {
	
	/* @GetMapping permite acceder al metodo solamente a traves de la operacion de tipo GET*/
	@GetMapping("/welcome")
	public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World") String name, Model model) {
		
		model.addAttribute("name", name);
		return "welcome";/*nombre de la pagina a nagevar*/
	}

}
