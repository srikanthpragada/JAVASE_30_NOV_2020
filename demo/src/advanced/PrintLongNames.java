package advanced;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintLongNames {

	public static void main(String[] args) throws Exception {
	   Files.lines(Paths.get("names.txt"))
	        .filter(s -> s.length() > 4)
	        .forEach(System.out::println);
	}

}
