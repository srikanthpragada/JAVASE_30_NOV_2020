package advanced;

class MyTask implements Runnable {
	@Override
	public void run() {
		System.out.println("In Thread");
	}
}

public class LambdaDemo {

	public static void printNumbers() {
		for (int i = 1; i <= 5; i++)
			System.out.println(i);
	}

	public static void main(String[] args) {
		// Normal class
		Thread t1 = new Thread(new MyTask());
		t1.start();

		// Anonymous class
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				System.out.println("In Thread 2");
			}
		});

		t2.start();

		// Lambda Expression
		Thread t3 = new Thread(() -> System.out.println("In Thread 3"));
		t3.start();

//		Runnable task = () -> System.out.println("In Thread 3");
//		System.out.println(task.getClass());

		// Lambda Block
		Thread t4 = new Thread(() -> {
			for (int i = 1; i <= 5; i++)
				System.out.println(i);
		});

		t4.start();

		// Method reference
		Thread t5 = new Thread(LambdaDemo::printNumbers);
		t5.start();
	}

}
