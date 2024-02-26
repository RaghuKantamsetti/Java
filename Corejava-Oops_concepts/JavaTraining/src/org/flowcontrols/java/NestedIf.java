package org.flowcontrols.java;
import java.util.Scanner;
public class NestedIf {

	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		//Print number that is both prime and odd
		int n=in.nextInt();
		int flag=0,m=n/2;
		if (n%2!=0) {
			if (n==1) {
				System.out.println(n+" is odd but not prime");
			}
			else {
				for (int i=2;i<=m;i++) {
					if (n%i==0) {
						System.out.println(n+" is odd but not prime");
						flag=1;
						break;
					}
				if (flag==0) {
					System.out.println(n+" is both odd and prime");
					break;	
					}
				}
			}
		}
		else {
			System.out.println(n+" is even number");
		in.close();
		}
		

	}

}
