package org.task5assessment.java;

class Test{
	//to create only single instance for the class you can  use getInstance method 
	private static Test singleInstance=null;
	public String s;
	int i;
	private Test(String s,int i) {
		this.s=s;
		this.i=i;
	}
	public static Test Test() {
		//public static Test getInstance() {
		if (singleInstance==null) {
			singleInstance=new Test("java",100);
		}
		return singleInstance;

	}
}



public class SingletonClass {

	public static void main(String[] args) {
		//Test t= Test.getInstance();
		Test t= Test.Test();
		//Test t1=Test.getInstance();
		Test t1=Test.Test();
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
		System.out.println(t.equals(t1));
		System.out.println(t.s);
		System.out.println(t1.s+" "+t1.i);

	}

}