package org.polymorphism.com;
import java.util.Scanner;
class ContactNumbers{
	String name;
	long ph1,ph2;
	public void phoneNum(String name) {
		this.name=name;
	}
	public void phoneNum(long ph1,long ph2) {
		this.ph1=ph1;
		this.ph2=ph2;//Iterate array here
		System.out.println("The contact person name is "+name);
		System.out.println("The phone numbers are "+ph1+" "+ph2);
		
	}
}
public class Contacts {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ContactNumbers cont = new ContactNumbers();
		cont.phoneNum(sc.nextLine());
		cont.phoneNum(sc.nextLong(),sc.nextLong());
		sc.close();
	}

}
