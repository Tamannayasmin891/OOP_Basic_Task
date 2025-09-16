class Dog {
    String name;
    String breed;

    Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBreed(String breed) {
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " is a " + breed + ".");
    }
}

public class MainDog {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Buddy", "Golden Retriever");
        Dog dog2 = new Dog("Charlie", "Bulldog");

        dog1.printInfo();
        dog2.printInfo();

        System.out.println("\nSet the new Breed of dog1 and new name of dog2:");
        dog1.setBreed("Labrador Retriever");
        dog2.setName("Daisy");

        dog1.printInfo();
        dog2.printInfo();
    }
}
