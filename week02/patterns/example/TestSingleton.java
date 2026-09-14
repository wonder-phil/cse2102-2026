package example;

public class TestSingleton {
	
	public static void main(String[] args) {
		
		SingletonObject so_1 = SingletonObject.getInstance();
		SingletonObject so_2 = SingletonObject.getInstance();

		
		System.out.print("SingletonObject: ");
		if (so_1 == so_2) {
			System.out.println("Same object instances");
		} else {
			System.out.println("Different object instances");
		}
		
		NonSingleton ns_1 = new NonSingleton();
		NonSingleton ns_2 = new NonSingleton();
		
		System.out.print("Nonsingleton: ");
		if (ns_1 == ns_2) {
			System.out.println("Same object instances");
		} else {
			System.out.println("Different object instances");
		}
	
		
		
	}

}