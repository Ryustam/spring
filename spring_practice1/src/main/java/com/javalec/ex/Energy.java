package com.javalec.ex;

public class Energy {
	double m=0;
	double v=0;
	double h=0;
	
	public void setm(double m) {
		this.m=m;
	}
	public void setv(double v) {
		this.v=v;
	}
	public void seth(double h) {
		this.h=h;
	}
	public double Kinetic_E() {
		return 0.5*m*v*v;
	}
	public double Potential_E() {
		return m*9.8*h;
	}
}
