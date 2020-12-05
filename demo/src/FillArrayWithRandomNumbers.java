
public class FillArrayWithRandomNumbers {

	public static void main(String[] args) {
		int a[] = new int[10];

		for (int i = 0; i < a.length; i++)
			 a[i] = (int) (Math.random() * 100);

		// Enhanced for loop
		for (int n : a)
			System.out.println(n);

	}

}
