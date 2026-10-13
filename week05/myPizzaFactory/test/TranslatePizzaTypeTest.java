import org.junit.Test;
import static org.junit.Assert.*;

public class TranslatePizzaTypeTest {
    @Test
    public void testCheese() {
        assertEquals("Cheese", TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.CHEESE));
    }

    @Test
    public void testPepperoni() {
        assertEquals("Pepperoni", TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.PEPPERONI));
    }

    @Test
    public void testGreek() {
        assertEquals("Greek", TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.GREEK));
    }

    @Test
    public void testGlutenFree() {
        assertEquals("GlutenFree", TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.GLUTEN_FREE));
    }

    @Test
    public void testVegan() {
        assertEquals("Vegan", TranslatePizzaType.fromPizzaTypeEnumToString(PizzaType.VEGAN));
    }

    @Test
    public void testNull() {
        assertEquals("ERROR", TranslatePizzaType.fromPizzaTypeEnumToString(null));
    }
}
