package example;

public class SingletonObject {
	
	private SingletonObject() {
		value++;
	}
	
	private static SingletonObject INSTANCE = new SingletonObject();
	
	private int value = 0;
	
	public static SingletonObject getInstance() {
		return INSTANCE;
	}

}