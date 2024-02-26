package org.task21Assessment.java;


public class Operations {
	final int  plus=0;
	final int  minus=1;
	final int divide=2;
	final int  mluti=3;
	public double calculate(int  i,double a,double b ) {
		if (i==plus) {
			return a+b;
		}
		else if(i==minus) {
			return a-b;
		}
		else if(i==divide) {
			return a/b;
		}
		
		else  {
			return a*b;
		}
	}
}
