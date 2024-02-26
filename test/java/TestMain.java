package org.test.java;

import java.util.Scanner;


public class TestMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Car1 c = new Car1();
		Bike1 b = new Bike1();
		while (true) {
			System.out.println("enter bike(2) \nenter car(4) \nenter (0) exit :");
			int j=sc.nextInt();
			if(j==4) {
				System.out.println("enter (0) for leaving\nenter (1) for entering:");
				int st=sc.nextInt();
				if (st == 1) {
					c.showSlotsForBikes();
					System.out.println("Please select one slot number from above list:");
					c.carEntering(sc.nextInt());
					continue;

				}
				else {
					c.showSlotsForBikes();
					System.out.println("Enter your slot no: ");
					c.carLeaving(sc.nextInt());
					c.showSlotsForBikes();
					continue;
				}
			}
			else if(j==2) {
				System.out.println("enter (0) for leaving\nenter (1) for entering:");
				int st=sc.nextInt();

				if (st == 1) {
					b.showSlotsForBikes();
					System.out.println("Please select one slot number from above list:");
					b.bikeEntering(sc.nextInt());
					continue;
				}
				else {
					b.showSlotsForBikes();
					System.out.println("Enter your slot no: ");
					b.bikeLeaving(sc.nextInt());
					b.showSlotsForBikes();
					continue;
				}
			}
			else {
				System.out.println("Thank you");
				return;
			}
		}
	}
}
