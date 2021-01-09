package advanced;

import java.nio.file.Files;
import java.nio.file.Path;

public class PrintResultFromMarks {

	public static void main(String[] args) throws Exception {
        Files.lines(Path.of("marks.txt"))
             .mapToInt(v -> Integer.parseInt(v))
             .filter(m -> m > 60)
             .forEach(System.out::println);
	}

}
