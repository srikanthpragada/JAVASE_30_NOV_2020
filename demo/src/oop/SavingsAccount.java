package oop;

public class SavingsAccount {
	// Instance variables
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public SavingsAccount(int ano, String name) {
		acno = ano;
		ahname = name;
		balance = 0;
	}

	public SavingsAccount(int ano, String name, double bal) {
		acno = ano;
		ahname = name;
		balance = bal;
	}

	// Methods
	public void print() {
		System.out.println(acno);
		System.out.println(ahname);
		System.out.println(balance);
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public double getBalance() {
		return balance;
	}

}
