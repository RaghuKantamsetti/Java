package org.parkingslots.java;

import java.util.*;

/*question 15:
parking slots
1. there are two basements b1 and b2 both contains 30 slots
2. b1 for bikes and b2 for cars
3. allocate a vehicles with slots and generate a receipt and don't allocate a single slot for two vehicles
4. and store the data in a file*/




public class ParkingSlots {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter bike(2) or car(4):");
		int j=sc.nextInt();
		if(j==4) {
			System.out.println("enter (0) for leaving,(1) for entering:");
			int st=sc.nextInt();
			Cars c = new Cars();
			if (st == 1) {
				c.carEntering();
			}
			else {
				System.out.println("Enter your slot no: ");
				c.carLeaving(sc.nextInt());
			}
		}
		else {
			System.out.println("enter (0) for leaving,(1) for entering:");
			int st=sc.nextInt();
			Bikes b = new Bikes();
			if (st == 1) {
				b.bikeEntering();
			}
			else {
				System.out.println("Enter your slot no: ");
				b.bikeLeaving(sc.nextInt());
			}
			sc.close();
		}
		
	}

}
