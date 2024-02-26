package org.garbagecollector.java;
class Emp{
	protected void finalize() {
		System.out.println("object is garbage collector");
	}
}
public class Sample {

	public static void main(String[] args) {
		Emp e1= new Emp();
		Emp e2=new Emp();
		//e1=null;
		e1=e2;
		System.gc();
	}

}
