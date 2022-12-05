package com.im_a_beginner.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	    // Load the spring configuration file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		// Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		// Call methods on the bean
		System.out.println(theCoach.getDailyWorkout()); 
		
		System.out.println(theCoach.getDailyFortune());
		
		// Close the context
		context.close(); 
		
		// Section 6 Completes on this program
	}

}