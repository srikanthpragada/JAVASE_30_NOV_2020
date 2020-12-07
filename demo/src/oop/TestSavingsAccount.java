package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		SavingsAccount a; // object reference

		a = new SavingsAccount(); // object
		a.open(1, "Scott");
		a.deposit(10000);
		a.print();
		
		SavingsAccount a2 = new SavingsAccount();
		a2.print();
	}

}
