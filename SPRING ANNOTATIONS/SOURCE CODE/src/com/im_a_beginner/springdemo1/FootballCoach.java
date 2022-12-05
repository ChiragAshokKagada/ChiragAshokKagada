package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

@Component
public class FootballCoach implements Coach {

	private FortuneService fortuneService; 
	
	public FootballCoach() {
		System.out.println("Football coach's - Default constructor."); 
	}
	
	// SETTOR INJECTION USING AUTOWIRED ANNOTATION 
	@Autowired 
	@Qualifier("databaseFortuneService")
	public void setBestFortuneService(FortuneService theFortuneService) {
		System.out.println("Football coach's - Setter method.");
	     this.fortuneService = theFortuneService ;	
	}
	
	@Override
	public String getDailyWorkout() {  
		return "Hello I'm your football coach. Go take a whole "
				+ "round of the football field." ; 
	}

	@Override
	public String getDailyFortune() { 
		return fortuneService.getFortune();  
	}
 
}