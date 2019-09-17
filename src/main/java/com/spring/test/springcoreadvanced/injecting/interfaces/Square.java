package com.spring.test.springcoreadvanced.injecting.interfaces;

import org.springframework.stereotype.Component;

@Component
public class Square implements Shape{

	@Override
	public void draw() {
		System.out.println("This is Square");
	}

	

}
