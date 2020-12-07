
public class FunctionsDemo {

	public static int add(int a, int b) {
		return a + b;
	}

	public static boolean isEven(int n) {
		return n % 2 == 0;
	}

	public static void greet(String name) {
		System.out.println("Hello " + name);
	}

	// Variable number of arguments
	public static void greetings(String message, String ... names) {
		for (String n : names)
			System.out.printf("%s %s\n",message, n);
	}

	public static void main(String[] args) {

//		System.out.println(add(10, 20));
//		System.out.println(isEven(10));
//		greet("James");
		greetings("Hello", "James", "Anders", "Scott");
		greetings("Hi", "Dan", "Joe");

	}

}
