package com.javalec.ex;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();

		ctx.load("classpath:applicationCTX.xml");
		
		ctx.refresh();
		Student student = ctx.getBean("student", Student.class);
		OtherStudent otherStudent = ctx.getBean("otherStudent", OtherStudent.class);
		student.info();
		otherStudent.info();
		ctx.close();
		
	}
	
}
