package com.im_a_beginner.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConstructDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext1.xml");
		
		// retrieve bean from spring container 
		BasketballCoach theCoach = context.getBean("myBasketballCoach",BasketballCoach.class);
		 
		
		// call methods on the bean 
	    // Object reference (BasketballCoach) 
		 
		System.out.println(theCoach.getDailyWorkout());  
	    
	    System.out.println(theCoach.getDailyFortune()); 
		
		// Call our new methods to get the literal values
	    System.out.println(theCoach.getEmailAddress());
	    
	    System.out.println(theCoach.getTeam()); 
	    
	    
	    //close the context
	    context.close(); 
	}
}
