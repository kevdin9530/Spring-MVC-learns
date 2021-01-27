package com.spring.mvcdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {

		// create a student object
		Customer c = new Customer();

		// add student object in model with student name
		model.addAttribute("customer", c);

		return "customer-form";
	}

	@RequestMapping("/processForm")
	// the model attribute must have the correct name
	public String processForm(@Valid @ModelAttribute("customer") Customer c, BindingResult bdResult) {

		// log the input data
		if(bdResult.hasErrors())
			return "customer-form";
		else
			return "customer-process";
	}

	//custom editor
	@InitBinder //this will pre-process all web request coming into controller
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor ste = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, ste);
	}
}
