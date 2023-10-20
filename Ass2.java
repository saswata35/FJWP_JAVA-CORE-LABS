//Question-2:-
/*Write a Java program that demonstrates method overriding by creating a superclass
called Animal and two subclasses called Dog and Cat.
● The Animal class should have a method called makeSound(), which
simply prints "The animal makes a sound."
● The Dog and Cat classes should override this method to print
"TheCat/The dog meows/barks" respectively.
● The program should allow the user to create and display objects of each
class.
[Hint:Use multilevel inheritance]
*/
//Input:-
//Package Name:-
package Assessments_java;
//Scanner Class:-
import java.util.Scanner;

//Superclass
class Animal {
 // Method to make a sound
 public void makeSound() {
     System.out.println("The animal makes a sound.");
 }
}

//Subclass Dog
class Dog extends Animal {
 // Override makeSound() for Dog
 @Override
 public void makeSound() {
     System.out.println("The dog barks.");
 }
}

//Subclass Cat
class Cat extends Animal {
 // Override makeSound() for Cat
 @Override
 public void makeSound() {
     System.out.println("The cat meows.");
 }
}

//Main class
public class Ass2 {
 public static void main(String[] args) {
     // Allow the user to create and display objects of each class
     Scanner scanner = new Scanner(System.in);

     // Create Animal object
     Animal animal = new Animal();
     System.out.println("Animal Sound:");
     animal.makeSound(); // Calls the makeSound() of the Animal class

     // Create Dog object
     Dog dog = new Dog();
     System.out.println("\nDog Sound:");
     dog.makeSound(); // Calls the overridden makeSound() of the Dog class

     // Create Cat object
     Cat cat = new Cat();
     System.out.println("\nCat Sound:");
     cat.makeSound(); // Calls the overridden makeSound() of the Cat class
     //Closing the Scanner Class
     scanner.close();
 }
}
//Output:-
/*
Animal Sound:
The animal makes a sound.

Dog Sound:
The dog barks.

Cat Sound:
The cat meows.
*/