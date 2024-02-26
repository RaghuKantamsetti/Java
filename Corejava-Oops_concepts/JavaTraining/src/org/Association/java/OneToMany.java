package org.Association.java;

class Bank{
	private String name;
	public Bank(String name) {
		this.name=name;
	}
	public String getBankName() {
		return this.name;
	}
}
class AccHolder{
	private String name;
	public AccHolder(String name) {
		this.name=name;
	}
	public String getEmpName() {
		return this.name;
	}
}
public class OneToMany {

	public static void main(String[] args) {
		Bank b1=new Bank("Canara bank");
		AccHolder e1=new AccHolder("Pavan");
		System.out.println(e1.getEmpName()+" has a bank account in "+b1.getBankName());
	}

}// This is the one example of Association i.e, one to many bank have many account holders
