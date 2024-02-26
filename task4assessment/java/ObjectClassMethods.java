package org.task4assessment.java;

class Test{
	int i;
	Test(int i) {
		this.i=i;
	}
	public int hashCode() {
		return i;
	}
	public String toString() {
		return i+" ";
	}
}
public class ObjectClassMethods {
	public static void main(String[] args) {
		Test t=new Test(100);
		Test t2=new Test(100);
		System.out.println("HashCode of the object ---" +t2+t);//you want print object reference 
		//then use toString to convert
		System.out.println("Using equals method check the both object are equal or not ---" +t.equals(t2));
		//it checks the reference of the object
	}
}