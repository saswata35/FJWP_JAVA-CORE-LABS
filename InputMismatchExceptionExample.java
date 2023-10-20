//Question-2
/*
Write a program that prompts the user to enter an integer. Handle the
InputMismatchException that might occur if the user enters a non-integer value.
*/
//Input:-
//Package Name:-
package Exception;
//InputMismatchException-Exception Class:-
import java.util.InputMismatchException;
//Scanner Class:-
import java.util.Scanner;
//File Name:-
public class InputMismatchExceptionExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Try Block
        try {
            System.out.print("Enter an integer: ");
            int userInteger = scanner.nextInt();
            System.out.println("You entered: " + userInteger);
        }
        //InputMismatchException in Catch Block
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid integer.");
        }
        //Finally Block
        finally {
            // Close the scanner to prevent resource leaks
            scanner.close();//End of Close the Scanner Class
        }
    }
}
//Output:-
/*userInteger Output:-
Enter an integer: 18
You entered: 18
*/
//InputMismatchException Output:-
/*
Enter an integer: abc
Error: Please enter a valid integer.
*/