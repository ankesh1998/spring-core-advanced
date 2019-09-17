package com.spring.test.springcoreadvanced.stereotype.annotation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("teach")
public class Teacher {
	
	@Value("#{22+13}")			// Spring Expression Language
	private int id;
	
	@Value("Ankesh pandey")
	private String name;

	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + "]";
	}

	
}
