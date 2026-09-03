package inheritance;

public class Dog extends Animal {
    public Dog() {
        super();
        anmialType = "Dog";
    }

    public static void main(String[] args) {
        System.out.println("This is a dog");
        Dog dog = new Dog();
        dog.noise();
    }

    @Override 
    public void noise() {
        System.out.println("Bark bark");
    }
}