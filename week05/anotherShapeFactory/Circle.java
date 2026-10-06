public class Circle implements Shape {
	
	private double area;
	
	public Circle(double r) {
		area = Math.PI * r * r;
	}

    @Override 
	public double area() {
		return area;
	}

    @Override 
	public void draw() {
		System.out.println("Draw circle");
	}
}