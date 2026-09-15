package example;

public class SingletonObject {
	
	private SingletonObject() {
		value++;
	}
	
	private static SingletonObject INSTANCE = new SingletonObject();
	
	public int value = 0;
	
	public static SingletonObject getInstance() {
		return INSTANCE;
	}

}