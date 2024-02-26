package org.multithreading.java;

/*Create a multithreaded program by creating a subclass of Thread and then creating, 
 * initializing, and staring two Thread objects from your class. The threads will
 *  execute concurrently and display Java is hot,aromatic, and invigorating to the 
 *  console window.
 */

class Thread1 extends Thread{
	public void run() {
		System.out.println("Java is HOT");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Java is Invigorating");
		
	}
}
class Thread2 extends Thread{
	public void run() {
		System.out.println("Java is Aromatic ");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Java is Life");

	}
}


public class TaskOne {

	public static void main(String[] args) {
		Thread1 obj1=new Thread1();
		Thread2 obj2=new Thread2();
		obj1.start();
		obj2.start();
	}

}
