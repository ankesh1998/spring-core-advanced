package com.spring.test.springcoreadvanced.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/test/springcoreadvanced/standalone/collection/config.xml");
		
		ProductsList pl = (ProductsList) context.getBean("productList");
		System.out.println(pl);
	}

}
