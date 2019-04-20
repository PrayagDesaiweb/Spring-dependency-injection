package com.prayagdesai.dependency;

public class CricketCoach implements Coach {
	// step1 cerate a no-arg constructor
	public CricketCoach() {
		System.out.println("Inside the no arg constructor");
	}
	
	// step2 generate setter for this
	
	private FortuneService fortuneService;
	// this setter method will be called by the sprint when spring will inject the dependency
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("inside the setter method of the cricket coach");
		this.fortuneService = fortuneService;
	}

	@Override
	public String getFortune() {
		// TODO Auto-generated method stub
		return fortuneService.getFortune();
	}

	@Override
	public String getDailyWorkout() {
		// TODO Auto-generated method stub
		return "practice fast bowling";
	}

}
