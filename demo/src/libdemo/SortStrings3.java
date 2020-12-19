package libdemo;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings3 {

	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Python", "C#", "C", "TypeScript", "SQL" };

		// Lambda Expression
		Arrays.sort(names, (s1,s2) -> s1.length() - s2.length());
	 
		for (String n : names)
			System.out.println(n);

	}

}
