package com.mostafa.sna;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	@Value("${foo.name}")
	private String name;
	
	@Value("${foo.age}")
	private int age;
	
	private FortuneService fortuneService;
	
	public SwimCoach() {
		
	}

	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkOut() {
		return "Swim 1000 meters as a warm up.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
}
