package com.im_a_beginner.springdemo1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAnnotationsDemoApp {
      public static void main(String[] args){
    	// Load the Spring configuration file
    	 ClassPathXmlApplicationContext context =
    	   new ClassPathXmlApplicationContext("applicationContext.xml");
    	   
       // Load the methods on the bean
    	 CricketCoach Coach  = context.getBean("cricketCoach",CricketCoach.class);
    	   
    	 CricketCoach alphaCoach  = context.getBean("cricketCoach",CricketCoach.class);
    	    
    	 BasketballCoach Coach1 = context.getBean("basketballCoach",BasketballCoach.class);
    	 
    	 BasketballCoach alphaCoach1  = context.getBean("basketballCoach",BasketballCoach.class);
    	 
       // Testing the result(CricketCoach)
    	 Boolean result =(Coach == alphaCoach);
    	    
       // Call the methods on the bean(CricketCoach)
    	 System.out.println("The result of object referrence is : " + result );
    	    
    	    
       // Checking the memory location of the object referring to the bean
       // (CricketCoach)
    	 System.out.println("Memory location of the Coach is : " + Coach);
    	    
    	 System.out.println("Memory location of the alphaCoach is : " + alphaCoach);
    	     
    	 
    	 
       // Testing the result(BasketballCoach)
    	 Boolean result1 = (Coach1 == alphaCoach1);
    	
       // Testing the result(BasketballCoach)	
         System.out.println("The result of object referrence is : " + result1 );
     	
       // Checking the memory location of the object referring to the bean
         // (BasketballCoach)
      	 System.out.println("Memory location of the Coach1 is : " + Coach1);
      	    
      	 System.out.println("Memory location of the alphaCoach1 is : " + alphaCoach1);
      	 
    	 
      // Close the context
    	  context.close();
    	  
      // Section 9 completes on this program
       } 
      
}
