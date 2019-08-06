package com.mostafa.sna;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

//		read the config java class
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportsConfig.class);
		
//		get bean from spring container
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		
//		call a method of bean
		System.out.println(coach.getDailyWorkOut());
		
		System.out.println(coach.getDailyFortune());
		
		System.out.println("The name of Swimming Coach is "+coach.getName());
		
		System.out.println("The Swimming Coach is "+coach.getAge()+" years old.");
		
//		close context
		context.close();

	}

}
