public class TranslatePizzaType {

    public static String fromPizzaTypeEnumToString(PizzaType pizzaType) {
        
        switch (pizzaType) {
            case CHEESE:
                return "Cheese";
        
            case PEPPERONI:
                return "Pepperoni";

            case GREEK:
                return "Greek";
                
            case GLUTEN_FREE:
                return "GlutenFree";

            case VEGAN:
                return "Vegan";
                
            default:
                System.err.println("Not a valid pizza type");
                return "ERROR";
        }
    }

}
