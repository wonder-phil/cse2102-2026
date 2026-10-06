public class ShapeFactory {
	
    public Shape getShape(String shapeType, double measure, double measure2){
        
        Shape s = null;
        switch(shapeType.toUpperCase()) {
            case "CIRCLE":
            s = new Circle(measure);
            break;
        case "SQUARE":
            s = new Rectangle(measure, measure);
            break;
        case "RECTANGLE":
            s = new Rectangle(measure, measure2);
            break;
        }
        
        return s;
    }
}