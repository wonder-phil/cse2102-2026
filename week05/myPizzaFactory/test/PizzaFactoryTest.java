import org.junit.Test;
import static org.junit.Assert.*;

public class PizzaFactoryTest {
    private final PizzaFactory factory = new PizzaFactory();

    @Test
    public void testCheesePizzaOrder() {
        Pizza pizza = factory.pizzaOrder(PizzaType.CHEESE);
        assertNotNull(pizza);
        assertTrue(pizza instanceof CheesePizza);
    }

    @Test
    public void testGreekPizzaOrder() {
        Pizza pizza = factory.pizzaOrder(PizzaType.GREEK);
        assertNotNull(pizza);
        assertTrue(pizza instanceof GreekPizza);
    }

    @Test
    public void testPepperoniPizzaOrder() {
        Pizza pizza = factory.pizzaOrder(PizzaType.PEPPERONI);
        assertNotNull(pizza);
        assertTrue(pizza instanceof PepperoniPizza);
    }

    @Test
    public void testGlutenFreePizzaOrder() {
        Pizza pizza = factory.pizzaOrder(PizzaType.GLUTEN_FREE);
        assertNotNull(pizza);
        assertTrue(pizza instanceof GlutenFreePizza);
    }

    @Test
    public void testVeganPizzaOrder() {
        Pizza pizza = factory.pizzaOrder(PizzaType.VEGAN);
        assertNotNull(pizza);
        assertTrue(pizza instanceof VeganPizza);
    }

    @Test
    public void testNullPizzaOrder() {
        Pizza pizza = factory.pizzaOrder(null);
        assertNull(pizza);
    }
}
