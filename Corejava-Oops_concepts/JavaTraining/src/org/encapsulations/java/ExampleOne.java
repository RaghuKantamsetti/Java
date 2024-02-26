package org.encapsulations.java;

class Test{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
}
public class ExampleOne {

	public static void main(String[] args) {
		Test b=new Test();
		b.setName("Raghu");
		System.out.println(b.getName());
	}

}
