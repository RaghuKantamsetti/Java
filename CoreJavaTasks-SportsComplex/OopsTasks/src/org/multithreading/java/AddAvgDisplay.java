package org.multithreading.java;

/*2. A thread has "add" operation,other thread performs"avg" and other thread 
 * performs "display" operation which displays avg and add details after the two 
 * threads are compeletely performed.
 */


class Adding extends Thread{
	static int  c;
	public void run() {
		int a=10,b=20;
		c=a+b;
	}
}
class Avg extends Thread{
	static float  c;

	public void run() {
		float a=10,b=20;
		c=(a+b)/2;
	}
}
class Display extends Thread{
	public void run() {
		System.out.println("Adding two numbers: "+Adding.c);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Avg of two numbers: "+Avg.c);
		
	}
}



public class AddAvgDisplay {

	public static void main(String[] args) throws Exception {
		Adding obj1=new Adding();
		Avg obj2 = new Avg();
		Display obj3=new Display();
		obj1.start();
		obj2.start();
		/*obj1.join();
		obj2.join();*/
		obj3.start();
		
	}

}
