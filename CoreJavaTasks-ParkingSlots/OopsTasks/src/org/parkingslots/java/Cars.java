package org.parkingslots.java;
import java.util.*;
public class Cars {
	HashMap<Integer,String> carSlots = new HashMap<> ();
	Scanner sc=new Scanner(System.in);
	Cars(){
	carSlots.put(1,null);
	carSlots.put(2,"virat");
	carSlots.put(3,"rohit");
	carSlots.put(4,null);
	carSlots.put(5,"rohit");
	carSlots.put(6,"rohit");
	carSlots.put(7,"rohit");
	carSlots.put(8,"rohit");
	carSlots.put(9,"rohit");
	carSlots.put(10,"rohit");
	carSlots.put(11,"rohit");
	carSlots.put(12,"rohit");
	carSlots.put(13,"rohit");
	carSlots.put(14,"rohit");
	carSlots.put(15,null);
	}
		public void carEntering() {
		
		for (int i=1;i<=15;i++) {
			if (carSlots.get(i)==null) {
				System.out.println("Enter your name: ");
				carSlots.put(i, sc.next());
				System.out.println("Your slot no is: "+i);
				continue;
				
			}
			
			}
		
		System.out.println("All slots are filled");
		
	}
		public void carLeaving(int n) {
			carSlots.replace(n, null);
			this.carEntering();
	}
	
		
}
	


