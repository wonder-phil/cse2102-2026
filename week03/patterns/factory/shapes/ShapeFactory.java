public class ShapeFactory {
	
    //use getShape method to get object of type shape 
    public Shape getShape(String shapeType, double measure){
        if(shapeType == null){
            return null;
        }		
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            if (Circle.getCountCircles() > 3) {
                System.err.println("No more than 3 circles!");
                return null; // Yipes!
            }
            Shape s = new Circle();
            ((Circle) s).setradius(measure);
            return s;
            
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            Shape s = new Square();
            ((Square) s).setSide(measure);
            return s;
            
        } else if(shapeType.equalsIgnoreCase("CUBE")){
            Shape s = new Cube();
            ((Cube) s).setSide(measure);
            return s;
            
        }
        
        return null;
    }
}