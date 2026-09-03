package has_a;

import inheritance.Dog;

class NoisyAnimal {

    private static Dog greyhound;

    public static void main(String[] args) {
        greyhound = new Dog();

        greyhound.noise();

    }
}



