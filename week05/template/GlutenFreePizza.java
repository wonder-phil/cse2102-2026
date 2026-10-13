
public class GlutenFreePizza implements PreparePizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing glutenfree pizza dough");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza wiht seperate GF pizza cutters");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza");
    }
}