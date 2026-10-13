public class Square implements Shape {
	
	double area;
	
	public Square(double s) {
		area = s * s;
	}
	
	@Override
	public double area() {
		return area;
	}

    @Override
	public void draw() {
		System.out.println("Draw square");
	}
	
}