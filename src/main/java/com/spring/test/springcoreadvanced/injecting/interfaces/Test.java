package com.spring.test.springcoreadvanced.injecting.interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcoreadvanced/injecting/interfaces/config.xml");
	Square sq = (Square) context.getBean("square");
	sq.draw();
	}
}
