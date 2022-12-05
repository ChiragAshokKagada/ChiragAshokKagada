package com.im_a_beginner.springdemo1;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService; 
 
	// CONSTRUCTOR INJECTION METHOD WITH THE HELP OF AUTOWIRED ANNOTATION
	public TennisCoach() {
		System.out.println("Tennis coach's - Default constructor."); 
	}
	
	public TennisCoach(FortuneService theFortuneService){
		System.out.println("Tennis coach's - Created Constructor.");
		fortuneService = theFortuneService ;
	} 
	
	// SETTER INJECTION METHOD WITH THE HELP OF AUTOWIRED ANNOTATION
	
    //	@Autowired
	//  System.out.println("Tennis coach's - Default constructor.");
    //	public void setFortuneService(FortuneService theFortuneService) {
    //		this.fortuneService = theFortuneService ; 
    //	}
	
	@Override
	public String getDailyWorkout() {
		return "Hello it's your Tennis Coach. Practice your backhand volley"; 
	}
	
	@Override  
	public String getDailyFortune(){
		return fortuneService.getFortune(); 
	} 
	 
} 