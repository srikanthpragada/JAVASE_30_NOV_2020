package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ListJavaFiles {

	public static void main(String[] args) throws IOException {

       Files.walk( Path.of("c:\\classroom\\nov30j"))
            .filter(p -> p.toString().endsWith(".java"))
            .forEach(System.out::println);
       

	}

}
