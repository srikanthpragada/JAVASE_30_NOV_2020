
public class Test {

	public static void main(String[] args) throws InterruptedException {
		int a = 10, b = 0;
		
		System.out.println(a / b);   // ArthimeticException 
		try {
		Thread.sleep(1000);          // InterruptedException
		}
		catch(Exception ex) {
			
		}
	 

	}

}
