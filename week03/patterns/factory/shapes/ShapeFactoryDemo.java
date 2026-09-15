public class ShapeFactoryDemo {

	   public static void main(String[] args) {
	      ShapeFactory shapeFactory = new ShapeFactory();

	      //get an object of Circle and call its draw method.
	      Shape s_1 = shapeFactory.getShape("CIRCLE", 1.0);
	      System.out.println("Circle: " + s_1.area());
	      
	      s_1 = shapeFactory.getShape("CIRCLE", 2.0);
	      System.out.println("Circle: " + s_1.area());
	      
	      s_1 = shapeFactory.getShape("CIRCLE", 3.0);
	      System.out.println("Circle: " + s_1.area());
	      
	      s_1 = shapeFactory.getShape("CIRCLE", 4.0);
	      System.out.println("Circle: " + s_1.area());
	      
	      /* */
	      s_1 = shapeFactory.getShape("CIRCLE", 5.0);
	      System.out.println("Circle: " + s_1.area());
	      
	      
	      Shape s_2 = shapeFactory.getShape("SQUARE", 3.0);
	      System.out.println("Square: " + s_2.area());
	      
	      Shape s_3 = shapeFactory.getShape("CUBE", 3.0);
	      System.out.println("Cube: " + s_3.area());

	   }
}