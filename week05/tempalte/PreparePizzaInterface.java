

public interface PreparePizzaInterface extends PizzaInterface {

     public default void makePizza() {
        prepare();
        bake();
        cut();
        box();
    }

    
}