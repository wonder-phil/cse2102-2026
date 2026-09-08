package inheritance;


class Animal {
    
    protected String animalType;

    public Animal(String type) {
        animalType = type;
    }


    Animal() {
        animalType = "none";
    }

    public void noise() {
        System.out.println("Make animal noise");
    }

}