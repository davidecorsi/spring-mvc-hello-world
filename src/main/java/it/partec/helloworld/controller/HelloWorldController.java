package it.partec.helloworld.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HelloWorldController {
	
	@Value("${testo}")
	private String testo;
	
	@GetMapping("/hello/{name}")
	public String hello(@PathVariable("name") String name, Model model) {
		model.addAttribute("name", name);
		model.addAttribute("testo", testo);
		return "home";
	}
}
