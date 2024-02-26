package org.inheritence.java;


class Trees extends Animals{
	void bamboos() {
		System.out.println("lengthy");
	}
}

public class MultilLevel {

	public static void main(String[] args) {
		Trees d=new Trees();
		d.green();
		d.lions();
		d.bamboos();

	}

}
