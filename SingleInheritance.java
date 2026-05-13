import java.util.Scanner;

class Animal {
    protected String name;
    protected int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void eat() {
        System.out.println(name + " is eating...");
    }

    void sleep() {
        System.out.println(name + " is sleeping...");
    }
}


class Dog extends Animal {
    String breed;

    
    Dog(String name, int age, String breed) {
        super(name, age);  
        this.breed = breed;
    }

    void bark() {
        System.out.println(name + " is barking...");
    }


    @Override
    void eat() {
        System.out.println(name + " is eating dog food...");
    }

    void displayDetails() {
        System.out.println("Dog Name : " + name);
        System.out.println("Dog Age  : " + age);
        System.out.println("Breed    : " + breed);
    }
}

public class SingleInheritance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Dog Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Dog Age: ");
        int age = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Dog Breed: ");
        String breed = sc.nextLine();

        Dog d = new Dog(name, age, breed);

        System.out.println("\n--- Dog Details ---");
        d.displayDetails();

        System.out.println();

        d.eat(); 
        d.sleep();
        d.bark();  

        sc.close();
    }
}
