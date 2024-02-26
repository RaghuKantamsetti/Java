package org.statickeyword.java;

class Students{
	int id;
	String name;
	static String clg="kgrl";
	Students(int i,String s){
		id=i;
		name=s;
	}
	void display() {
		System.out.println(id+" "+name+" "+clg);
	}
}
public class WithStatic {
	
	public static void main(String[] args) {
		Students s1 =new Students(100,"raghu");
		Students s2 =new Students(101,"pavan");
		s1.display();
		s2.display();

	}

}
