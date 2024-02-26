package org.multithreading.java;

/* Display all the properties of running threads. Create 3 threads and 
 * rename thread1 to "yourName" and make this thread a daemon thread.
 * Get the updated thread details.
 */

class ThreadOne extends Thread{
	public void run() {
		if(Thread.currentThread().isDaemon()){//checking for daemon thread  
			   System.out.println("Thread one is daemon thread");  
		}  
		else{  
			  System.out.println("user thread work");  
		}   
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}
class ThreadTwo extends Thread{
	public void run() {
		System.out.println("This is thread two");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
}
class ThreadThree extends Thread{
	public void run() {
		System.out.println("This is thread three");
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
}

public class AllProperties {

	public static void main(String[] args) throws Exception {
		ThreadOne obj1=new ThreadOne();
		ThreadTwo obj2 = new ThreadTwo();
		ThreadThree obj3=new ThreadThree();
		obj1.setName("Raghu");
		obj1.setDaemon(true);
		System.out.println("the Thread one is D "+obj1.isDaemon());

		System.out.println("the Thread one name is "+obj1.getName());
		System.out.println(obj1.getPriority());
		obj1.start();
		System.out.println("this thread is alive: "+obj1.isAlive());
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		//obj1.join();
		System.out.println("this thread is alive: "+obj1.isAlive());
		obj2.start();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		obj3.start();
		

		
	}

}
