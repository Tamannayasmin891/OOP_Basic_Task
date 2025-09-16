class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void printInfo() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class Person1 {
    public static void main(String[] args) {
        Person p1 = new Person("Ean Craig", 11);
        Person p2 = new Person("Evan Ross", 12);

        p1.printInfo();
        p2.printInfo();

        System.out.println("\nSet new age and name:");
        p1.age = 14;
        p2.name = "Lewis Jordan";
        p2.age = 12;

        p1.printInfo();
        p2.printInfo();
    }
}
