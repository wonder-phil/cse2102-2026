
public class CheesePizza implements PreparePizzaInterface {

    @Override
    public void prepare() {
        System.out.println("Preparing cheese pizza");
    }

    @Override
    public void bake() {
        System.out.println("Baking pizza");
    }

    @Override
    public void cut() {
        System.out.println("Cutting pizza");
    }

    @Override
    public void box() {
        System.out.println("Boxing pizza");
    }
}