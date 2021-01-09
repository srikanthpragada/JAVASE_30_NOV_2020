package advanced;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.function.Consumer;

public class PrintJavaFiles {
	
	public static void printJavaFile(Path p) {
		try {
			System.out.printf("\n***** %s *****\n", p.toString());
			int lineno = 1;
			for (String line : Files.readAllLines(p))
				System.out.printf("%3d : %s\n", lineno++,line);
		}
		catch(Exception ex) {
			
		}
	}

	public static void main(String[] args) throws IOException {

       Files.walk( Path.of("c:\\classroom\\nov30j\\demo\\src\\advanced"))
            .filter(p -> p.toString().endsWith(".java"))
            .forEach(p -> printJavaFile(p));
 
	}

}
