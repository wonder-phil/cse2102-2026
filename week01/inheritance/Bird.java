package inheritance;

public class Bird extends Animal {
    public Bird() {
        super();
        animalType = "Bird";
    }

    public static void main(String[] args) {
        System.out.println("This is a bird");
        Bird bird = new Bird();
        bird.noise();
    }

    @Override 
    public void noise() {
        System.out.println("Screech - Screech");
    }
}