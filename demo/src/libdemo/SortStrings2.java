package libdemo;

import java.util.Arrays;
import java.util.Comparator;

public class SortStrings2 {

	public static void main(String[] args) {
		String names[] = { "Java", "JavaScript", "Python", "C#", "C", "TypeScript", "SQL" };
		
		// Anonymous inner class 
		Arrays.sort(names, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				return s1.length() - s2.length();
			}
		});
		
		for (String n : names)
			System.out.println(n);

	}

}
