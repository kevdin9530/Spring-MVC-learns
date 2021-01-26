package com.spring.mvcdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	@RequestMapping("/")
	public String someRequest() {
		return "main-menu";
	}

	@RequestMapping("/showForm")
	public String showForm() {
		return "hello-world-form";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "hello-world";
	}

	@RequestMapping("/processForm2")
	public String processForm2(HttpServletRequest rq, Model model) {
		//read the request parameter from html form
		String name = rq.getParameter("studentName");
		
		//convert the data to all caps
		name = name.toUpperCase();
		
		//create a message
		String result = "Yo "+name+"!";
		
		//add message to the model 
		model.addAttribute("message",result);
		
		return "hello-world";
		
	}

	//Using @RequestParam("name_of_param") instead HttpServletRequest
	@RequestMapping("/processForm2_2")
	public String processForm2_2(@RequestParam("studentName") String
			name, Model model) {
		name = name.toUpperCase();
		model.addAttribute("message","Yo! "+name);
		return "hello-world";
	}
}
