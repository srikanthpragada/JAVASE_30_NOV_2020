package advanced;

import java.util.Arrays;

public class ArrayStreamDemo {

	public static void main(String[] args) {

		int marks[] = { 90, 88, 76, 56, 44, 30, 98, 88 };

		Arrays.stream(marks)
		        .filter(n -> n > 50) // Predicate (boolean test(T))
				.sorted()
				// .forEach(n -> System.out.println(n)); // Consumer (void accept(T))
				.forEach(System.out::println); // Method reference
		
		// Print top 3 marks
		Arrays.stream(marks)
		      .sorted()
		      .limit(3)
		      .forEach(n -> System.out.printf("%5d", n));
		
		System.out.println("\nGreater than average marks\n");
		// Print marks > average marks 
		double avg = Arrays.stream(marks).average().getAsDouble();
		Arrays.stream(marks).filter(n -> n > avg).sorted().forEach(System.out::println);
		
	    
	}

}
