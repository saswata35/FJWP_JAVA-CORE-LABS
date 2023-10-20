//Question-1:-
/*1.Create a base class called Vehicle with the following methods: ● void
start(): This method should print "Vehicle started." Create two
subclasses of Vehicle called Car and Motorcycle. Override the
start() method in each subclass to provide a specific
implementation:
● Car: Print "Car started."
● Motorcycle: Print "Motorcycle started."
Create a class called Garage with a method named
serviceVehicle(Vehicle vehicle). Inside this method, call the start()
method of the provided vehicle object and print "Vehicle serviced."
In the Main class, create instances of Car and Motorcycle. Create
an instance of the Garage class.
Call the serviceVehicle() method of the Garage class with instances
of both Car and Motorcycle.
*/
//Input:-
//Package Name:-
package Vahicle_java;
//Class Name:-
class Vehicle {
    public void start() {
        System.out.println("Vehicle started.");
    }
}
//subclass-1
class Car extends Vehicle {
    @Override //Overriding
    public void start() {
        System.out.println("Car started.");
    }
}
//subclass-2
class Motorcycle extends Vehicle {
    @Override  //Overriding
    public void start() {
        System.out.println("Motorcycle started.");
    }
}
//Another Class Name within method name
class Garage {
    public void serviceVehicle(Vehicle vehicle) {
        vehicle.start(); //start method
        System.out.println("Vehicle serviced.");
    }
}
//File Name
public class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        Motorcycle myMotorcycle = new Motorcycle();
        Garage myGarage = new Garage();

        myGarage.serviceVehicle(myCar);
        myGarage.serviceVehicle(myMotorcycle);
    }
}
//Output:-
/*Car started.
Vehicle serviced.
Motorcycle started.
Vehicle serviced.
*/