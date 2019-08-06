package com.mostafa.sna;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

//		read the config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		get bean from spring container
		Coach coach = context.getBean("tennisCoach", Coach.class);
		
//		call a method of bean
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
//		close context
		context.close();

	}

}
