package com.im_a_beginner.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	    // Load the spring configuration file 
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		// Retrieve the bean from spring container
		Coach theCoach = context.getBean("myCoach",Coach.class);
		
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		// Check if they are same
		boolean result  = (theCoach == alphaCoach);
		
		// Print out the results
		System.out.println("\nPointing to the same object : " + result);
		
		System.out.println("\nMemory location for theCoach : " + theCoach);
		
		System.out.println("\nMemory location for alphaCoach : " + alphaCoach + "\n");
		
		// Close the context
		context.close();
	}

}