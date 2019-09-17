package com.spring.test.springcore.propertiesplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcore/propertiesplaceholder/config.xml");
		MyDAO x = (MyDAO) context.getBean("myDAO");
		System.out.println(x);
	}
}
