import java.util.Scanner;



public class PizzaStore {
    private String name;
    private String address;

    public static void main(String[] args) {
           
        PizzaFactory pizzaFactory = new PizzaFactory();

        boolean valid = false;
        Pizza pizzaOrder = null;
        Scanner scanner = new Scanner(System.in);

        while (!valid) {
            
            System.out.print("Enter pizza type (Cheese, Greek, Pepperoni, Vegan, GlutenFree): ");
            String pizzaTypeInput = scanner.nextLine();
            switch (pizzaTypeInput.toLowerCase()) {
                case "cheese":
                    pizzaOrder = pizzaFactory.pizzaOrder(PizzaType.CHEESE);
                    break;
                case "greek":
                    pizzaOrder = pizzaFactory.pizzaOrder(PizzaType.GREEK);
                    break;
                case "pepperoni":
                    pizzaOrder = pizzaFactory.pizzaOrder(PizzaType.PEPPERONI);
                    break;
                case "vegan":
                    pizzaOrder = pizzaFactory.pizzaOrder(PizzaType.VEGAN);
                    break;
                case "glutenfree":
                    pizzaOrder = pizzaFactory.pizzaOrder(PizzaType.GLUTEN_FREE);
                    break;
                default:
                    System.out.println("Invalid pizza type. Please try again.");
            }
            if (pizzaOrder != null) {
                pizzaOrder.prepare();
                pizzaOrder.bake();
                pizzaOrder.cut();
                pizzaOrder.box();
                valid = true;
            }
        }
        scanner.close();
    }

    public PizzaStore(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void openShop() {
        System.out.println(name + " at " + address + " is now open!");
    }

    public void closeShop() {
        System.out.println(name + " is now closed.");
    }
}