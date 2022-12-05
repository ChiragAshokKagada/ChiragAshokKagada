package com.im_a_beginner.springdemo;

public class CricketCoach implements Coach {
	
    private FortuneService1 fortuneService1 ;
    
    //Adding new fields for emailAddress and team
    private String emailAddress1 ;
    private String team1 ;
        
    // Create a no-argument constructor
    public CricketCoach() {
    	System.out.println("CricketCoach : inside no-arg constructor");
    }
    
    // Our setter method
	public void setFortuneService1(FortuneService1 theFortuneService) {
		System.out.println("CricketCoach : inside setter method - setFortuneService");
		this.fortuneService1 = theFortuneService;
	}
    
	public String getEmailAddress1() {
		return emailAddress1 ; 
	} 
	
	public void setEmailAddress1(String emailAddress) {
		System.out.println("CricketCoach : inside setter method - setEmailAddress");
		this.emailAddress1 = emailAddress;
	}

	public String getTeam1() {
		return team1 ; 
	} 
	
	public void setTeam1(String team) {
		System.out.println("CricketCoach : inside setter method - setTeamName");
		this.team1 = team;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() { 
		return fortuneService1.getFortune(); 
	}
}







