package libdemo;

public class BoxingDemo {

	public static void main(String[] args) {
		Integer ref;
	 
	    ref = 10;     // AutoBoxing 
		System.out.println(ref.getClass());
		
		int v = ref;
		System.out.println(v);
	}
}
