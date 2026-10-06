public class Rectangle implements Shape {
	
	double area;
	
	public Rectangle(double w, double h) {
		area = w * h;
	}
	
	@Override
	public double area() {
		return area;
	}

    @Override
	public void draw() {
		System.out.println("Draw rectangle");
	}
	
}