package com.mostafa.sna;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class TennisCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
//	public TennisCoach() {
//		
//	}
//
	@Autowired
	public TennisCoach(@Qualifier("randomFortuneService")FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
//
//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		this.fortuneService = fortuneService;
//	}
	
	@PostConstruct
	public void doMyStartUpStuff() {
		System.out.println("TennisCoach: inside of doMyStartUpStuff()");
	}
	
	@PreDestroy
	public void doMyCleanUpStuff() {
		System.out.println("TennisCoach: inside of doMyCleanUpStuff()");
	}

	@Override
	public String getDailyWorkOut() {
		return "Practice backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
}
