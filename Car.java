/*Session-3 Lab
 * Assignment-1.
● Write a Java program named Car
● The Car class should have the following attributes: make (String), model
(String) , year (short) , and price(int) .
● The car class should have a constructor that takes all the attributes.
● Add a main method to instantiate car objects.
● The program should allow the user to create and display objects of each Car Class.
 */
package Car.java;
import java.util.Scanner;

class Car1 {
    private String make;
    private String model;
    private short year;
    private int price;

    public Car1(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public void displayCarInfo() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("Price: $" + price);
    }
}

public class Car {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter car information:");
        System.out.print("Make: ");
        String make = scanner.nextLine();

        System.out.print("Model: ");
        String model = scanner.nextLine();

        System.out.print("Year: ");
        short year = scanner.nextShort();

        System.out.print("Price: $");
        int price = scanner.nextInt();

        Car1 car = new Car1(make, model, year, price);

        System.out.println("\nCar Information:");
        car.displayCarInfo();

        scanner.close();
    }
}