//Question-1:-
/*
 Create a Java program that acts as a simple calculator.
● The program should prompt the user to enter two numbers and an operator (+, -,
*, /).
● Perform the corresponding calculation based on the operator.
● Handle potential exceptions, such as division by zero or invalid operator input.
● Display the result or an appropriate error message.
 */
//Input:-
//Package Name
package ExceptionHandling_java;
//Scanner Class:-
	import java.util.Scanner;
//File Name:-
	public class Ass1 {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
          //Try Block:-
	        try {
	            // Get user input
	            System.out.print("Enter the first number: ");
	            int num1 = scanner.nextInt();
	            System.out.print("Enter the second number: ");
	            int num2 = scanner.nextInt();
	            System.out.print("Enter the operator (+, -, *, /): ");
	            //Functioning Character Operator
	            char operator = scanner.next().charAt(0);
	            // Perform calculation based on the operator
	            double result = 0;
	            //Switch Case:-
	            switch (operator) {
	                //Addition Function:-
	               //Functioning many operator case
	                case '+':
	                    result = num1 + num2;
	                    break;//break statement 
	                //Subtraction Function:-
	                case '-':
	                    result = num1 - num2;
	                    break;//break statement
	                //Multiplication Function:-
	                case '*':
	                    result = num1 * num2;
	                    break;//break statement
	                //Division Function:-
	                case '/':
	                	//if-else condition
	                    if (num2 != 0) {
	                        result = num1 / num2;
	                    } else {
	                        System.out.println("Error: Division by zero is not allowed.");
	                        return; // Exit the program
	                    }
	                    break;//break statement
	                //Default Case:-
	                default:
	                    System.out.println("Error: Invalid operator input.");
	                    return; // Exit the program
	            }
	            // Display the result
	            System.out.println("Result: " + result);
	        }
	        //Catch Block:-
	        catch (Exception e) {
	            System.out.println("Error: Invalid input. Please enter valid numbers and operator.");
	        }
	        //Finally Block:-
	        finally {
	            // Close the scanner to prevent resource leak
	            scanner.close();
	        }
	    }
	}
//Output:-
//Addition Function Output:-
/*
	Enter the first number: 5
	Enter the second number: 6
	Enter the operator (+, -, *, /): +
	Result: 11.0
*/
//Subtraction Function Output:-
/*
	Enter the first number: 20
	Enter the second number: 12
	Enter the operator (+, -, *, /): -
	Result: 8.0
*/
//Multiplication Function Output:-
/*
	Enter the first number: 30
	Enter the second number: 30
	Enter the operator (+, -, *, /): *
	Result: 900.0
*/
//Division Function Output:-
/*	
  Enter the first number: 14
  Enter the second number: 13
  Enter the operator (+, -, *, /): /
  Result: 1.0
*/
/*
	Enter the first number: 13
	Enter the second number: 14
	Enter the operator (+, -, *, /): /
	Result: 0.0
*/
/*
	Enter the first number: 5
	Enter the second number: 0
	Enter the operator (+, -, *, /): /
	Error: Division by zero is not allowed.
*/
/*
	Enter the first number: A
	Error: Invalid input. Please enter valid numbers and operator.
*/
/*
	Enter the first number: 0
	Enter the second number: 0
	Enter the operator (+, -, *, /): y
	Error: Invalid operator input.
*/