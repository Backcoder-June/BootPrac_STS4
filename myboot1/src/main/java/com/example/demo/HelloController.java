package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
	
	
	@GetMapping("/hello")
	public String hello(Model model) {
		
		model.addAttribute("hello","sts4 springboot");
		
		return "hello";
	}
	
	@ResponseBody
	@GetMapping("/ajax")
	public String hello2() {
		return "{\"response\" : \"아작스받아라\"}";
	}

}
