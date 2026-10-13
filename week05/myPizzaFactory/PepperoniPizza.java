public class PepperoniPizza implements Pizza {

    private PizzaType pizzaType;

    public PepperoniPizza() {
        this.pizzaType = PizzaType.PEPPERONI;
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