//Question-1:-
/*Write a Java program that uses lambda expressions to perform arithmetic operations
(addition, subtraction, multiplication, and division) on two numbers. Create lambda
expressions for each operation and then apply them to the numbers.
*/
//Input:-
//Package Name:-
package Lambda_Function;
//Interface Name and operate the values:-
interface ArithmeticOperation {
    double operate(double x, double y);
}
//File Name:-
public class LambdaExample1 {
    public static void main(String[] args) {
        // Lambda expressions for addition, subtraction, multiplication, and division
    	ArithmeticOperation addition = (x, y) -> x + y;
        ArithmeticOperation subtraction = (x, y) -> x - y;
        ArithmeticOperation multiplication = (x, y) -> x * y;
        ArithmeticOperation division = (x, y) -> {
            if (y != 0) {
                return x / y;
            } else {
                throw new ArithmeticException("Cannot divide by zero");//Arithmetic Exception Error
            }
        };
        // Example numbers
        double num1 = 10.0;
        double num2 = 5.0;
        // Applying the lambda expressions to perform arithmetic operations
        System.out.println("Addition: " + performOperation(addition, num1, num2));
        System.out.println("Subtraction: " + performOperation(subtraction, num1, num2));
        System.out.println("Multiplication: " + performOperation(multiplication, num1, num2));
        //Try Block:-
        try {
            System.out.println("Division: " + performOperation(division, num1, num2));
        } 
        //Catch Block:-
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());//Returns the detail message string of this throwable.
        }
    }
    // Helper method to apply the lambda expressions
    private static double performOperation(ArithmeticOperation operation, double x, double y) {
        return operation.operate(x, y);
    }
}
//Output:-
/*
Addition: 15.0
Subtraction: 5.0
Multiplication: 50.0
Division: 2.0
*/