package org.multithreading.java;

class Hii implements Runnable{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("Hii");
			try {
				Thread.sleep(1000);
			}
			catch(Exception r) {
				System.out.println(r);
			}
		}
	}
}
class HelloJava implements Runnable{
	
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("HelloJava"+i);
			
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception r) {
				System.out.println(r);
			}
		}
	}
}
public class ExampleTwo {

	public static void main(String[] args) throws Exception {
		
		Hii obj1=new Hii();
		HelloJava obj2=new HelloJava();
		
		Thread t1=new Thread(obj1,"Hii Thread");
		Thread t2=new Thread(obj2,"Hello Thread");
		
		t1.setPriority(Thread.MIN_PRIORITY);
		t2.setPriority(Thread.MAX_PRIORITY);
		
		System.out.println(t1.getPriority());
		System.out.println(t2.getPriority());
		
		System.out.println(t1.getName());
		System.out.println(t2.getName());
		System.out.println();

		t1.start();
		try{
			Thread.sleep(5);
		}
		catch(Exception r){
			System.out.println(r);
		}
		t2.start();
		
		t1.join();
		t2.join();
		System.out.println(t2.isAlive());
		System.out.println("bye");
	}

}
