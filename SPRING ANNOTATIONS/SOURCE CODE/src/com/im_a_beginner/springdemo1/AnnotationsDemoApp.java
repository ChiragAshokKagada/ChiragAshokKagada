package com.im_a_beginner.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsDemoApp {

	public static void main(String[] args) {
		// read the spring configuration file
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
	    // get the bean from spring container
		Coach TennisCoach = context.getBean("tennisCoach",Coach.class);
		
		Coach FootballCoach = context.getBean("footballCoach", Coach.class);
		
		Coach BasketballCoach = context.getBean("basketballCoach",Coach.class);
		
		Coach CricketCoach = context.getBean("cricketCoach",Coach.class); 
		
		
		
		//++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
		//Calling methods of the Baseball coach (Used Constructor injection)
		
		// call a method on the bean
		
		System.out.println(TennisCoach.getDailyWorkout()); 
		
		// Calling new method to get daily fortune 
		
		System.out.println(TennisCoach.getDailyFortune()); 
		
		 
		//++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
		//Calling methods of the Football coach (Setter injection)
		
		System.out.println(FootballCoach.getDailyWorkout()); 
		
		// Calling new method to get daily fortune 
		
		System.out.println(FootballCoach.getDailyFortune());
		
		
		
		//++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
		//Calling methods of the Basketball coach (Method injection)
		
		System.out.println(BasketballCoach.getDailyWorkout()); 
				
		// Calling new method to get daily fortune 
		
	    System.out.println(BasketballCoach.getDailyFortune()); 
	    
	    
	    
	    //++$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$++//
		
	    //Calling methods of the Cricket coach (Field injection)
		
	    System.out.println(CricketCoach.getDailyWorkout()); 
	  				
	    // Calling new method to get daily fortune 
	  		
	    System.out.println(CricketCoach.getDailyFortune()); 
	  	
		// close the context
		context.close(); 
		
		// Section 7 and 8 completes on this program
    } 
}



