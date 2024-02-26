package org.collectionstasks.java;

import java.util.HashMap;

class ReadData{
	HashMap<Integer,String> map=new HashMap<>();
	synchronized void data(int i,String name){
		map.put(1, "virat");
		map.put(2, "rohit");
		map.put(3, "pant");
		map.put(i, name);
		
	}
}
class Thread1 extends Thread{
	ReadData r;
	Thread1(ReadData r){
		this.r=r;
	}
	public void run() {
		r.data(4, "boom");
		System.out.println(r.map);
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("this is thread1 method ");
	}
}
class Thread2 extends Thread{
	ReadData r;
	Thread2(ReadData r){
		this.r=r;
	}
	public void run() {
		r.data(5, "jaddu");
		System.out.println(r.map);
		System.out.println("this is thread2 method ");
	}
}


public class SynchroHashMap {

	public static void main(String[] args) {
		ReadData re=new ReadData();
		Thread1 t1=new Thread1(re);
		Thread2 t2=new Thread2(re);
		t1.setPriority(10);
		t1.start();
		try {
			Thread.sleep(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}

		t2.start();


	}

}
