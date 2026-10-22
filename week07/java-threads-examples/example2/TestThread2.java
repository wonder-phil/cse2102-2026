package example2;

public class TestThread2 {
	

	public static void main(String[] args) throws InterruptedException {
		
		Share share = new Share(3);
		
		Thread thread_A = new ThreadExtension(share,"Thread_AAA");
		Thread thread_B = new ThreadExtension(share,"Thread_BBB");
		
		
		thread_A.start();
		thread_B.start();
		
		System.out.print(" a: "+ String.valueOf(share.x).toString() + "\n");
		System.out.print(" b: "+ String.valueOf(share.y).toString() + "\n");
		
		thread_A.join();
		thread_B.join();
	
		System.out.print("shared static secret: " + share.getClassSecret());
	}
}
