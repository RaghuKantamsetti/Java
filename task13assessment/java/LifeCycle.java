package org.task13assessment.java;

class Thread1 extends Thread{
	public void run() {          //this is running state
		System.out.println("this is life cycle");
		try {
			Thread.sleep(1000);			// this is blocked stage
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}



public class LifeCycle {

	public static void main(String[] args) {
		Thread1 t=new Thread1();			//this is new() state
		t.start();							//this is runnable state
	}

}
