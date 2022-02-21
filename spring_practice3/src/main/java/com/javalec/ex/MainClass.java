package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Time_Conversion timeConv = ctx.getBean("timeConv",Time_Conversion.class);
		timeConv.getTimeFormat();
		ctx.close();
		
	}
	
}
