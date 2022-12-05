package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class BasketballCoach implements Coach {
	   
	   private FortuneService fortuneService;
	   
	   public BasketballCoach() {
		   System.out.println("Basketball Coach's - Default Constructor.");
	   }
	   
	   @Autowired
	   @Qualifier("happyFortuneService")
	   public void itsAnyMethod(FortuneService theFortuneService) {
		   System.out.println("Basketball Coach's - Any method with autowired annotation.");
		   this.fortuneService = theFortuneService ;
	   }
	   
       public String getDailyWorkout(){
    	   return "Hello I'm your Basketball Coach. Go and practice 500 "
    	   		+ "shots. The shots include pointers from all the dimensions "
    	   		+ "of the court and also dribble shots and dunking shots .";
       }
       
       public String getDailyFortune() {
    	   return fortuneService.getFortune();
       }
       
       // Create an initialization method 
       @PostConstruct
       public void doTheInitialMethod(){
    	   System.out.println("BaseketBall Coach's --> Initialization method.");
       }
       
       // Create a destruction method 
       @PreDestroy
       public void doTheDestructMethod(){
    	   System.out.println("Basketball Coach's --> Destruction method.");
       }
} 