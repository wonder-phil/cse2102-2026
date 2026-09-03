package inheritance;


public class Animal {
    
    protected String anmialType;

    public Animal(String type) {
        anmialType = type;
    }

    Animal() {
        anmialType = "none";
    }

    public void noise() {
        System.out.println("Make animal noise");
    }


}