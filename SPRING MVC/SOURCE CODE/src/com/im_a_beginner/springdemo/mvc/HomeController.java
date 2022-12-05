package com.im_a_beginner.springdemo.mvc;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	   @RequestMapping("/mainMenu")
       public String displayPage() {
    	   return "main-menu";
       }
}