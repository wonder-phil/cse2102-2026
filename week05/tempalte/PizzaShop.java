//package week05.tempalte;

public class PizzaShop {
    public static void main(String[] args) {
        
        System.out.println("\n\nMaking cheese pizza:");
        PreparePizzaInterface pizzaForSale = new CheesePizza();
        pizzaForSale.makePizza();

        System.out.println("\n\nMaking gluten-free pizza:");
        PreparePizzaInterface GFpizzaForSale = new GlutenFreePizza();
        GFpizzaForSale.makePizza();
    }
} 
