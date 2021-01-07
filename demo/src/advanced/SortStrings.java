package advanced;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {
	@Override
	public int compare(String s1, String s2) {
		return s1.length() - s2.length();
	}
}

public class SortStrings {
	public static void main(String[] args) {
		String names[] = { "java", "JavaScript", "Python", "C#", "c" };

		System.out.println("Using Default Comparision");
		Arrays.sort(names);
		for (var s : names)
			System.out.println(s);

		// Using a class
		System.out.println("Using custom class to compare by length");
		Arrays.sort(names, new LengthCompare());
		for (var s : names)
			System.out.println(s);

		// Using anonymous class
		System.out.println("Using anonymous class to compare by length");
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});

		for (var s : names)
			System.out.println(s);

		// Using Lambda Expression
		System.out.println("Using lambda expression to compare by length");
		Arrays.sort(names, (s1, s2) -> s1.length() - s2.length());

		for (var s : names)
			System.out.println(s);
	}
}
