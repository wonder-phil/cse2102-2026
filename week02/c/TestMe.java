package c;

public class TestMe {
	private double value = Double.NaN;

	public static void main(String[] args) {
		System.out.println("Hello world!");
	}

	public TestMe() {}

	public double square() { return value*value; }
    
	public void setValue(double v) {
		value = v;
	}

}
