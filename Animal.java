package Animal.java;

class Animal1 {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Animal1 {
    @Override
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class Animal {
    public static void main(String[] args) {
        Animal1 animal = new Animal1();
        Dog dog = new Dog();
        Cat cat = new Cat();

        System.out.println("Animal sound:");
        animal.makeSound();

        System.out.println("\nDog sound:");
        dog.makeSound();

        System.out.println("\nCat sound:");
        cat.makeSound();
    }
}
