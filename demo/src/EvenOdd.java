// Take a number and display whether it is even or odd 

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		 
		Scanner s = new Scanner(System.in);
		System.out.print("Enter a number :");
		int num = s.nextInt();   // Read an int from keyboard 
		
		if(num % 2 == 0)
			System.out.println("Even");
		else
			System.out.println("Odd");
		
	}

}
