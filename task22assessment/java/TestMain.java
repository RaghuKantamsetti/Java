package org.task22assessment.java;


/*Provide an interface Company with
default method of return type double calculating the profit(CP-SP)
static method of return type String which takes (double) input from previous method and returns company name.
Abstract method String getCompDetails(double profit,String name);=>Needs to be implemented using Lambda expression.*/




public abstract class TestMain implements Company {

	public static void main(String[] args) {
		
	
	
	Company com=(sp,cp,value)->{
		int profit=(sp-cp);
		return  profit+" ";	
	};
	System.out.println(com.getCompDetails(100, 50,"Data"));
	}
	

}
