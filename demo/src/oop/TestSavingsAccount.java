package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {

		System.out.println(SavingsAccount.getMinbal()); // Call static method

		SavingsAccount a; // object reference

		a = new SavingsAccount(1, "Scott");
		a.deposit(10000);
		a.print();

		SavingsAccount a2 = new SavingsAccount(2, "Tom", 20000);
		try {
			a2.withdraw(100000);
		} catch (InsufficientFundsException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
