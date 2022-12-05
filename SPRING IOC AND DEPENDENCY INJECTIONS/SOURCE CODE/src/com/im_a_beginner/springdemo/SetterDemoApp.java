package com.im_a_beginner.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {

	public static void main(String[] args) {
		// load the configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container 
		CricketCoach theCoach = context.getBean("myCricketCoach",CricketCoach.class);
		
		
		// call methods on the bean 
	    // Object reference (CricketCoach)
		
		System.out.println(theCoach.getDailyWorkout()); 
	    
	    System.out.println(theCoach.getDailyFortune());
		
		// Call our new methods to get the literal values
	    System.out.println(theCoach.getEmailAddress1());
	    
	    System.out.println(theCoach.getTeam1()); 
	    
	    
	    //close the context
	    context.close(); 
	}
}
