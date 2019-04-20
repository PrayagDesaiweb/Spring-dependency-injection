package com.prayagdesai.dependency;

public class BaseballCoach implements Coach {
	// define the priate field for dependency
	private FortuneService fortuneService; 
	//define the constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend time in the batting cage";
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}
}
