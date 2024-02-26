package org.inheritence.java;

class Forest{
	void green(){
		System.out.println("greenary");
		
	}
}
class Animals extends Forest{
	void lions() {
		System.out.println("roars");
	}
}
public class SingleInherit {

	public static void main(String[] args) {
		Animals d=new Animals();
		d.green();
		d.lions();
		
	}

}
