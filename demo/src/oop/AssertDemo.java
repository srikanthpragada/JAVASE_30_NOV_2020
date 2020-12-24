package oop;

public class AssertDemo {

	public static void main(String[] args) throws InsufficientFundsException {
		SavingsAccount sa = new SavingsAccount(1,"Abc",10000);
		sa.deposit(10000);
		sa.withdraw(5000);
		assert sa.getBalance() == 15000 : "Invalid balance. It should be 15000";
		

	}

}
