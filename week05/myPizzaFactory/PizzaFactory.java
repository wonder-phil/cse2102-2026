public class PizzaFactory {

    public Pizza pizzaOrder(PizzaType type) {
        switch (type) {
            case CHEESE:
                return new CheesePizza();
            case GREEK:
                return new GreekPizza();
            case PEPPERONI:
                return new PepperoniPizza();
            case GLUTEN_FREE:
                return new GlutenFreePizza();
            case VEGAN:
                return new VeganPizza();
            default:
                return null;
        }
        
    }

}