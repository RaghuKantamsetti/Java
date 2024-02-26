package org.sportscomplex.java;

import java.util.*;

public class SportsComplex {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		boolean bb=true;
		BadmintonSlots bad=new BadmintonSlots();
		FootballSlots foot=new FootballSlots();
		BoxCricketSlots cricket=new BoxCricketSlots();
		while(bb) {
			System.out.println("Want to continue press 0 otherwise press 1: ");
			int j=sc.nextInt();
			if (j==1) {
				System.out.println("see you soon.......");
				return;
			}
			System.out.println("enter name: ");
			String   name=sc.next();
			System.out.println("Select whish Sports do you want "
									+'\n'+ "Enter (1) for Badminton "
									+'\n'+"Enter (2) for Football "
									+'\n'+"Enter (3) for BoxCricket "
									+'\n'+"enter any number to show list of booked slots ");
				
			int sport=sc.nextInt();
			if (sport==1) {
				//this block belongs to Badminton
				if(BadmintonSlots.badmintonTiming.isEmpty()) {
					System.out.println("slots not available");
				}
				else {
					bad.availableSlots();
					System.out.println("Enter slot no:");
					bad.badminton(sc.nextInt(),name);
					continue;
				}
				
			}
			else if(sport==2) {
				//this  block belongs to Football
				if(FootballSlots.footballTiming.isEmpty()) {
					System.out.println("slots not available");
				}
				else {
					foot.availableSlotsFootball();
					System.out.println("Enter slot no:");
					foot.football(sc.nextInt(),name);
					continue;
				}
				
			}
			else if(sport==3) {
				//this  block belongs to cricket
				if(BoxCricketSlots.cricketTiming.isEmpty()) {
					System.out.println("slots not available");
				}
				else {
					cricket.availableSlotsCricket();
					System.out.println("Enter slot no:");
					cricket.cricket(sc.nextInt(),name);
					continue;
				}
			}
			else {
					System.out.println("booked slots are:");
					System.out.println("For badminton"+ BadmintonSlots.badmintonfilledSlots);
					System.out.println("For football"+ FootballSlots.footballFilledSlots);
					System.out.println("For cricket"+ BoxCricketSlots.cricketFilledSlots);
			}
		
		}sc.close();
	}

}
