package oop;

public class InsufficientFundsException extends Exception {
       public InsufficientFundsException(double balance) {
    	   super("Insufficient Funds! Available funds :  " + balance);
       }
}
