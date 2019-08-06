package com.mostafa.sna;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:sports.properties")
//@ComponentScan("com.mostafa.sna")
public class SportsConfig {

	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	} 
	
	@Bean
	public Coach swimCoach() {
		return new SwimCoach(sadFortuneService());
	}
}
