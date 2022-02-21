package com.javalec.ex;

public class Time_Conversion {
	Time time;
	int hour=0;
	int min=0;
	int sec;
	
	public Time_Conversion(Time time) {
		this.time=time;
		this.hour=time.getSec()/3600;
		this.min=(time.getSec()%3600)/60;
		this.sec=(time.getSec()%3600)%60;
	}
	
	public void setTime_conversion(Time time) {
		this.time=time;
		this.hour=time.getSec()/3600;
		this.min=(time.getSec()%3600)/60;
		this.sec=(time.getSec()%3600)%60;
		
	}
	
	
	public void getTimeFormat() {
		System.out.println(this.hour+"Ω√"+this.min+"∫–"+this.sec+"√ ");
	}
	
}
