package com.im_a_beginner.springdemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// read the spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
	    // get the bean from spring container
		
		FootballCoach Coach = context.getBean("footballCoach", FootballCoach.class);
				
		 
		//++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
		//Calling methods of the Football coach (Setter injection)
		
		System.out.println(Coach.getDailyWorkout()); 
		
		// Calling new method to get daily fortune 
		
		System.out.println(Coach.getDailyFortune()); 
		
	  	
		// close the context
		context.close();  
    }  
}