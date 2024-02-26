package org.interfaces.java;
interface Earth{
	void humanPopulation();
}
interface Forest{
	void wildPopulation();
}
class Need implements Earth,Forest{
	public void humanPopulation() {
		System.out.println("need to be decresed");
	}
	public void wildPopulation() {
		System.out.println("need to be increase");
	}
}
public class InterfacesExampleTwo {

	public static void main(String[] args) {
		Need b=new Need();
		b.humanPopulation();
		b.wildPopulation();
	}

}
