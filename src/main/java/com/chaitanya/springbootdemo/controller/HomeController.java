package com.chaitanya.springbootdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		
		return "Welcome to Spring Boot!";
	}
}
