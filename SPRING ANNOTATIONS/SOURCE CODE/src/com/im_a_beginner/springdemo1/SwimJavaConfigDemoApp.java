package com.im_a_beginner.springdemo1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// read the spring configuration file
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(SportConfig.class);
		
	    // get the bean from spring container
		
		SwimCoach Coach = context.getBean("swimCoach",SwimCoach.class);
		 
		//++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
		//Calling methods of the Football coach (Setter injection)
		
		System.out.println(Coach.getDailyWorkout()); 
		 
		// Calling new method to get daily fortune  
		
		System.out.println(Coach.getDailyFortune());  
		
	  	// Calling new methods of the new SwimCoach class
		// Calling method to get the email
		System.out.println("Email-id of Coach is : " + Coach.getCoachEmail());
		
		// Calling method to get the team name
		System.out.println("The team name is : " + Coach.getTeamName());
		
		// close the context
		context.close();  
		
		
		// Section 10 completes on this program
    }  
}

