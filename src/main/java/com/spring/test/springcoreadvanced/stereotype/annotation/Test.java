package com.spring.test.springcoreadvanced.stereotype.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcoreadvanced/stereotype/annotation/config.xml");
		Teacher t = (Teacher) context.getBean("teach");
		System.out.println(t);

	}

}
