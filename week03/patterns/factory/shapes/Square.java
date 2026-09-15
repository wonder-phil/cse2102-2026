public class Square implements Shape {
	
	double side;
	
	public Square() { }
	
	public Square(double s) {
		side = s;
	}
	
	@Override
	public double area() {
		return side*side;
	}

    @Override
	public void draw() {
		System.out.println("Draw square");
	}
	
	public void setSide(double s) {
		side = s;
	}
	
	public double getSide() {
		return side;
	}
}