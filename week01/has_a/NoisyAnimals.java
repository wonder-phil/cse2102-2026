package has_a;

import inheritance.*;

class NoisyAnimals {

    private static Dog greyhound;
    private static Bird screecher;

    public static void main(String[] args) {
        greyhound = new Dog();
        greyhound.noise();

        screecher = new Bird();
        screecher.noise();
    }
}



