package org.multithreading.java;

class Hi extends Thread{
	public void run() {
		for (int i=1;i<=5;i++) {
			System.out.println("Hi");
			try{
				Thread.sleep(500);
			}
			catch(Exception r){
				System.out.println(r);
			}
		}
	}
}
class Hello extends  Thread{
	static Thread t;
	public void run() {
		
		for (int i=1;i<=5;i++) {
			System.out.println("Hello");
			if (i==4) {
				t.stop();
			}
			try{
				Thread.sleep(500);
			}
			catch(Exception r){
				System.out.println(r);
			}
		}
	}
}

public class ExampleOne {
	
	public static void main(String[] args) throws Exception {
		Hi obj1=new Hi();
		
		Hello obj2=new Hello();
		Hello.t=new Thread(obj2);
		obj1.start();
		try{
			Thread.sleep(5);
		}
		catch(Exception r){
			System.out.println(r);
		}
		Hello.t.start();
		obj1.join();
		obj2.join();
		System.out.println(obj2.isAlive());
		System.out.println("bye");
	}

}
