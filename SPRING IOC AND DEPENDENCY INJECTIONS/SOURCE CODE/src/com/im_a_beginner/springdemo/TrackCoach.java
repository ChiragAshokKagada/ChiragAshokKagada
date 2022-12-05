package com.im_a_beginner.springdemo;

public class TrackCoach implements Coach {

	// Define a private field for the dependency
		private FortuneService fortuneService;
		
		
	// No Argument Constructor
		public TrackCoach() {
			
		}
	// Define a constructor for dependency injection
		public TrackCoach(FortuneService theFortuneService) {
			fortuneService = theFortuneService ;
		}
		
		
	@Override
	public String getDailyWorkout() {
		return "Run a hard 5000 meters ";
	}

	@Override
	public String getDailyFortune() {
		
		return "Just Do It : " + fortuneService.getFortune();
	}
	
	// Initialization method
	public void doMyStartupStuff(){
		System.out.println("TrackCoach - I'm inside the initialization method - doMyStartupStuff ");
	}
	
	// Destruction method 
	public void doMyCleanupStuff() {
		System.out.println("TrackCoach - I'm inside the destruction method - doMyCleanUpStuff ");
	}
}

	
	
	
	
	
	
	
	
	
	
