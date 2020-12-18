package libdemo;

import java.util.Arrays;
import java.util.Comparator;

class LengthCompare implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {
	     return  s1.length() - s2.length();
	}
	
}

public class SortStrings {

	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Python", "C#", "C", "TypeScript", "SQL" };

		// Arrays.sort(names);
		Arrays.sort(names, new LengthCompare());

		for (String n : names)
			System.out.println(n);

	}

}
