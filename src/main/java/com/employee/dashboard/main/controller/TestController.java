package com.employee.dashboard.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test")
	public String sayHello(Model theModel){
		theModel.addAttribute("theDate", new java.util.Date());

		return "helloworld";
	}

}