package com.im_a_beginner.springdemo1;

import org.springframework.stereotype.Component;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.context.annotation.Scope;

@Component
@Scope("prototype")
public class CricketCoach implements Coach {
    // It's an example of field injection 
	
	// There is no need of setter method 
	
	// There is also no need to specifically create a constructor
	
	// There is just a need of default constructor
	
	@Autowired
	@Qualifier("RESTFortuneService") 
	private FortuneService fortuneService ;
	
	public CricketCoach() {
		System.out.println("Cricket Coach's : Default Constructor");
	}
	
	@Override
	public String getDailyWorkout() {
		return "Hello I'm your Cricket Coach. Practice batting for 5 hours everyday.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}