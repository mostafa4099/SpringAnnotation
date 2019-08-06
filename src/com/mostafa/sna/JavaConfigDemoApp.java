package com.mostafa.sna;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {

//		read the config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
//		get bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
//		call a method of bean
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
//		close context
		context.close();

	}

}
