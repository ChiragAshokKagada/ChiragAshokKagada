package com.im_a_beginner.springdemo;

public class BasketballCoach implements Coach{
	
	// Define a private field for the dependency
	private FortuneService fortuneService;
	
	//Adding new fields for emailAddress and team
    private String emailAddress ;
    private String team ;
    
	// Define a constructor for dependency injection
	public BasketballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService ;
	}
	
	
	 @Override
     public String getDailyWorkout() {
    	 return "Spend 30 minutes on batting practice";
     }
    
	@Override
	public String getDailyFortune() {
		// Use my fortuneService to get a fortune
		
		return fortuneService.getFortune(); 
	}
	
	public String getEmailAddress() { 
		return emailAddress ;
	}
	
	public void setEmailAddress(String emailAddress) {
		System.out.println("Basketball Coach : inside setter method - setEmailAddress");                       
		this.emailAddress = emailAddress;
	}

	public String getTeam() {
		return team ;
	} 
	
	public void setTeam(String team) {
		System.out.println("Basketball Coach : inside setter method - setTeamName");
		this.team = team; 
	}
}