/*Session-3 Lab
 * Write a Java program named Car
● The Car class should have the following attributes: make (String), model
(String) , year (short) , and price(int) .
● The car class should have a constructor that takes all the attributes.
● Add a main method to instantiate car objects.
● The program should allow the user to create and display objects of each
Car Class.
Assignment-2.
● Write a Java program that demonstrates method overloading by
creating a class called Calculator.
● Add three methods called add().
● The first add() method should take two int variables as arguments
and return their sum as int.
● The second add() method should take three int variables as
arguments and return their sum as int.
● The third add() method should take two doubles as arguments and
return their sum as double.
● The program should allow the user to display the results of each
method.
 */
package Calculator.java;

import java.util.Scanner;

class Calculator1 {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }
}

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator1 calculator = new Calculator1();

        System.out.print("Enter two integers for the first add() method: ");
        int int1 = scanner.nextInt();
        int int2 = scanner.nextInt();

        int result1 = calculator.add(int1, int2);
        System.out.println("Result of the first add() method (int): " + result1);

        System.out.print("\nEnter three integers for the second add() method: ");
        int int3 = scanner.nextInt();
        int int4 = scanner.nextInt();
        int int5 = scanner.nextInt();

        int result2 = calculator.add(int3, int4, int5);
        System.out.println("Result of the second add() method (int): " + result2);

        System.out.print("\nEnter two doubles for the third add() method: ");
        double double1 = scanner.nextDouble();
        double double2 = scanner.nextDouble();

        double result3 = calculator.add(double1, double2);
        System.out.println("Result of the third add() method (double): " + result3);

        scanner.close();
    }
}
