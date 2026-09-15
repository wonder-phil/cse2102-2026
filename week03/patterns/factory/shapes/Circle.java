public class Circle implements Shape {
	
	private static int count_circles = 0;
	
	private double radius;
	
	public Circle() { count_circles++; }
	
	public Circle(double r) {
		radius = r;
		count_circles++;
	}

    @Override 
	public double area() {
		return 2*Math.PI*radius*radius;
	}

    @Override 
	public void draw() {
		System.out.println("Draw circle");
	}
	
	public double getradius() {
		return radius;
	}
	
	public void setradius(double r) {
		radius = r;
	}
	
	public static int getCountCircles() {
		return count_circles;
	}
}