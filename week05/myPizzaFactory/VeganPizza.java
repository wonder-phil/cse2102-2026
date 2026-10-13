public class VeganPizza implements Pizza {
    
    public VeganPizza() {
        this.pizzaType = PizzaType.VEGAN;
    }
    
    private PizzaType pizzaType;

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