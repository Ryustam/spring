package com.javalec.ex;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	
	public static void main(String[] args) {
		
		String configLocation = "classpath:applicationCTX.xml";
		AbstractApplicationContext ctx = new GenericXmlApplicationContext(configLocation);
		Energy energy = ctx.getBean("energy",Energy.class);
		
		double result=0;
		
		result=energy.Kinetic_E();
		System.out.println("운동에너지는:"+result+"J");
		
		result=energy.Potential_E();
		System.out.println("위치에너지는:"+result+"J");
		
		
		ctx.close();
		
	}
	
}
