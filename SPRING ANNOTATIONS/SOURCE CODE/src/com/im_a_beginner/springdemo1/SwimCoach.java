package com.im_a_beginner.springdemo1;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {

    private FortuneService fortuneService;
    
    @Value("${coach.email}")
    private String coachEmail ;
    
    @Value("${team.name}")
    private String teamName ;
    public SwimCoach(FortuneService theFortuneService){
    	this.fortuneService = theFortuneService ;
    }
    
	@Override
	public String getDailyWorkout() {
		return "Hello I'm your Swimming Coach. Go take 10 laps of the olympic pool as warm up session."; 
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();   
	}
	
	public String getCoachEmail() {
		return coachEmail ;
	}
    
	public String getTeamName() {
		return teamName ; 
	}
}

