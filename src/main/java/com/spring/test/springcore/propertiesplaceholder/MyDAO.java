package com.spring.test.springcore.propertiesplaceholder;

public class MyDAO {
	
	String dbName;

	public MyDAO(String dbName) {
		super();
		this.dbName = dbName;
	}

	@Override
	public String toString() {
		return "myDAO [dbName=" + dbName + "]";
	}

}
