package com.mostafa.sna;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueFortuneService implements FortuneService {
	
//	@Value("${foo.name}")
	private String name;
	
//	@Value("${foo.age}")
	private int age;

	@Override
	public String getFortune() {
		return "Fortune Men "+name+" who is "+age+" years old.";
	}

}
