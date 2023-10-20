//Question-2:-
/*
 ● Write a Java program to create a class called Shape with a method called
getArea().
● Create a subclass called Circle and create a constructor that takes the value
of radius(int) as input parameter.
● Override the getArea() method.
● Create a class called square that takes an attribute length. Create a
constructor that takes length as input.
● Override the getArea() method.
● Create a subclass of Shape called Rectangle that takes width and height as
input to the constructor.
● Override the getArea() method to calculate the area of a rectangle.
Instantiate and call getArea() method.
 */
//Input:-
//Package Name:-
package inheritence_java;
//Class Name:-
class Shape {
	//public Method:-
    public double getArea() {
        // Default implementation for base class
        return 0.0;
    }
}
//Inheritance:-
class Circle extends Shape {
    private int radius;
    // Constructor for Circle class
    public Circle(int radius) {
        this.radius = radius;
    }

    // Overriding the getArea() method in Circle class
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
//Inheritance:-
class Square extends Shape {
    private int length;

    // Constructor for Square class
    public Square(int length) {
        this.length = length;
    }

    // Overriding the getArea() method in Square class
    @Override

    public double getArea() {
        return length * length;
    }
}
//Inheritance:-
class Rectangle extends Shape {
    private int width;
    private int height;

    // Constructor for Rectangle class
    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    // Overriding the getArea() method in Rectangle class
    @Override

    public double getArea() {
        return width * height;
    }
}
//File Name:-
public class Main2 {
    public static void main(String[] args) {
        // Instantiate Circle, Square, and Rectangle classes
        Circle myCircle = new Circle(5);
        Square mySquare = new Square(4);
        Rectangle myRectangle = new Rectangle(3, 6);

        // Call getArea() method and print the results
        System.out.println("Circle Area: " + myCircle.getArea());
        System.out.println("Square Area: " + mySquare.getArea());
        System.out.println("Rectangle Area: " + myRectangle.getArea());
    }
}
//Output:-
/*
Circle Area: 78.53981633974483
Square Area: 16.0
Rectangle Area: 18.0
*/