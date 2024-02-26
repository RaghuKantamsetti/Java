package org.multithreading.java;

import java.io.*;
/* Exceptions with many catches and its order of execution.examine on specific to
 * general. Make sure to include both compile time and runtime exceptions in it.
 * try followed by catch and finally with return in all blocks. Examine output. try
 * followed by catch with return in both blocks. Examine output.
 */
class Division extends Thread{
	public void run() {
		System.out.println("this is thread one");
		try {
			Thread.sleep(5000);
			System.out.println("thread blocked for 5 secs");
			int c=1/0;
			return;
		}
		catch(ArithmeticException e) {
			System.out.println(e);
			return;
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println(e);
			return;

		}
		catch(Exception e) {
			System.out.println(e);
			return;

		}
		finally {
			System.out.println("this is finally block ");
		
		}
	}
}
class ArrayAdd extends Thread{
	

	public void run() {
		System.out.println("this is thread two");
		try {
			Thread.sleep(5000);
			System.out.println("thread blocked for 5 secs");
			FileInputStream in = new FileInputStream("input.txt");
            System.out.println("This is not printed");
        } 
        catch (Exception e) {
			System.out.println(e);

		}
	}
}

public class ExceptionInThreads {

	public static void main(String[] args) {
		Division b=new Division();
		ArrayAdd a=new ArrayAdd();
		b.start();
		
		try {
			Thread.sleep(5000);
        } 
        catch (Exception e) {
			System.out.println(e);
        }
		a.start();
		
	}

}
