package com.javalec.ex;

public class Person {
	String name;
	int age;
	double height;
	
	public Person(String name,int age,double height) {
		this.name=name;
		this.age=age;
		this.height=height;
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setHeight(double height) {
		this.height=height;
	}
	
	public void Introduce() {
		System.out.println("이름:"+this.name);
		System.out.println("나이:"+this.age);
		System.out.println("키:"+this.height);
	}
}
