public class GlutenFreePizza implements Pizza {
    
    private PizzaType pizzaType;

    public GlutenFreePizza() {
        this.pizzaType = PizzaType.GLUTEN_FREE;
    }

    public void prepare() {
        System.out.println("Preparing a " + TranslatePizzaType.fromPizzaTypeEnumToString(pizzaType));
    }
    public void bake() {
        System.out.println("Baking a " + TranslatePizzaType.fromPizzaTypeEnumToString(pizzaType));
    }
    public void cut() {
        System.out.println("Cutting a " + TranslatePizzaType.fromPizzaTypeEnumToString(pizzaType));
    }
    public void box() {
        System.out.println("Boxing a " + TranslatePizzaType.fromPizzaTypeEnumToString(pizzaType));
    }
}