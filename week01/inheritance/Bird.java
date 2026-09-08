package inheritance;

public class Bird extends Animal {
    public Bird() {
        super();
        anmialType = "Bird";
    }

    public static void main(String[] args) {
        System.out.println("This is a bird");
        Dog bird = new Bird();
        dog.noise();
    }

    @Override 
    public void noise() {
        System.out.println("Screech - Screech");
    }
}