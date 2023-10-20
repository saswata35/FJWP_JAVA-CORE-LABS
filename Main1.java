//Question-1:-
/*
● Write a Java program to create a class called Vehicle with a method called
drive().
● Vehicle should have attributes such as make (String), model (String) ,
year (int) and maximumSpeed (int).
● Create a constructor in Vehicle with all fields as constructor parameters.
● Create a subclass called Car and override constructor. Call super(). ●
Write a function that overrides the drive() method to print (make + “ ” +
model + " Car is driving". )
● Also create another subclass Bike extending the vehicle class. ●
Override the drive() method to print (make + “ ” + model + " Bike is
driving". )
● Instantiate both Bike and Car class. Print their attributes.
*/
//Input:-
//Package Name:-
package inheritence_java;
//Class Name:-
class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

    // Constructor for Vehicle class
    public Vehicle(String make, String model, int year, int maximumSpeed) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.maximumSpeed = maximumSpeed;
    }

    // Method in the Vehicle class
    public void drive() {
        System.out.println(make + " " + model + " is driving");
    }
}
//Inheritance:-
class Car extends Vehicle {
    // Constructor for Car class
    public Car(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive() method in Car class
    @Override

    public void drive() {
        System.out.println(make + " " + model + " Car is driving");
    }
}
//Inheritance:-
class Bike extends Vehicle {
    // Constructor for Bike class
    public Bike(String make, String model, int year, int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }

    // Overriding the drive() method in Bike class
    @Override
 
    public void drive() {
        System.out.println(make + " " + model + " Bike is driving");
    }
}
//File Name:-
public class Main1 {
    public static void main(String[] args) {
        // Instantiate Car and Bike classes
        Car myCar = new Car("Toyota", "Camry", 2022, 180);
        Bike myBike = new Bike("Honda", "CBR", 2021, 200);

        // Print Car attributes and drive
        System.out.println("Car Attributes:");
        System.out.println("Make: " + myCar.make);
        System.out.println("Model: " + myCar.model);
        System.out.println("Year: " + myCar.year);
        System.out.println("Maximum Speed: " + myCar.maximumSpeed + " km/h");
        myCar.drive();

        System.out.println(); // Empty line for better readability

        // Print Bike attributes and drive
        System.out.println("Bike Attributes:");
        System.out.println("Make: " + myBike.make);
        System.out.println("Model: " + myBike.model);
        System.out.println("Year: " + myBike.year);
        System.out.println("Maximum Speed: " + myBike.maximumSpeed + " km/h");
        myBike.drive();
    }
}
//Output:-
/*
Car Attributes:-
Make: Toyota
Model: Camry
Year: 2022
Maximum Speed: 180 km/h
Toyota Camry Car is driving

Bike Attributes:-
Make: Honda
Model: CBR
Year: 2021
Maximum Speed: 200 km/h
Honda CBR Bike is driving
*/