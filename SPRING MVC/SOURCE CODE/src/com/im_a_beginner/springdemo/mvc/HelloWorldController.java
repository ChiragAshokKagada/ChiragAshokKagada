package com.im_a_beginner.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	// need a controller method to show the initial HTML form
	@RequestMapping("/showForm")
	public String showForm() {
    	return "helloworld-form";
    }
	
	// need a controller method to process the HTML form
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloWorld"; 
	}
	
	// add a method to the controller and read the form data to the model
	// add data to the model
	@RequestMapping("/UpdatedVersionOfProcessForm")
	public String letsMakeItDude(HttpServletRequest request , Model model) {
		
		// read the request parameter from the HTML form
		String theName = request.getParameter("studentName");
		
		// Convert the string data to UpperCase letters
		theName = theName.toUpperCase();
		
		// Create the message
		String result = "Hii! " + theName;
		
		// add message to the model
		model.addAttribute("message", result);
		 
		return "helloWorld"; 
		
	}
		// Example of request parameter annotation in Spring MVC
		@RequestMapping("/UpdatedVersionOfProcessForm2")
		public String LetsMakeItMan(
		 @RequestParam("studentName")String theName , Model model) {
			
			// Convert the data to the UpperCase Letters
			theName = theName.toUpperCase();
			
			// Store the data into the 
			String result = "How are you? " + theName ;
			
			// Add the data into the form
			model.addAttribute("message",result);
			
			return "helloWorld"; 
		}
		
}