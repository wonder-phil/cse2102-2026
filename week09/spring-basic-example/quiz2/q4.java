

interface Pet {
    void play();
}

class Dog implements Pet {
    
    @Override
    public void play() {
        System.out.println("Dog is playing fetch.");
    }
}

public class q4 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.play();
    }
}