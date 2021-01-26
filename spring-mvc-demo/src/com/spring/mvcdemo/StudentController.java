package com.spring.mvcdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// create a student object
		Student s = new Student();

		// add student object in model with student name
		model.addAttribute("student", s);

		return "student-form";
	}

	@RequestMapping("/processForm")
	// the model attribute must have the correct name
	public String processForm(@ModelAttribute("student") Student s) {

		// log the input data
		System.out.println("Student name is: "+s.getFirstName()+ " "+ s.getLastName());
		return "student-process";
	}

}
