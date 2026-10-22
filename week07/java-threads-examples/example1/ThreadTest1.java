package example1;

public class ThreadTest1 {

	private static int a = 10;
	private static int b = -9;
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread thread_1 = new Thread("Thread 1") {
			@Override
			public void run() {
				my_method();
			}
		};
		
		Thread thread_2 = new Thread("Thread 2") {
			@Override
			public void run() {
				my_method();
			}
		};
		
		
		thread_1.start();
		thread_2.start();
		
		System.out.print("1 a: "+ String.valueOf(a).toString() + "\n");
		System.out.print("1 b: "+ String.valueOf(b).toString() + "\n");
		
		thread_1.join();
		thread_2.join();
		
	
	}
	
	public static void my_method() {
		a = a+5;
		b = b+5;
	}
	
}
