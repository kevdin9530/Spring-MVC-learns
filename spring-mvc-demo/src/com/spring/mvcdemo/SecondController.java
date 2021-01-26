package com.spring.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/second")
public class SecondController {
 
	@RequestMapping("/")
	public String someRequest() {
		return "main-menu";
	}
	
	@RequestMapping("/showForm")
	public String display() {
		return "hello-world-form";
	}
	@RequestMapping("/processForm")
	public String process() {
		return "hello-world";
	}
}
