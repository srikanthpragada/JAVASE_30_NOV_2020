package oop;

public class SavingsAccount {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;
	
	// Methods 
	public void open(int ano, String name) {
		acno = ano;
		ahname = name;
		balance = 0;
	}
	
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}
	
	public void deposit(double amount) {
		balance += amount;
	}

}
