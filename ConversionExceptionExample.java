//Question-3:-
/*
Write a program that takes user input and converts it to an integer using
Integer.parseInt(). Handle the NumberFormatException and NullPointerException
that might occur during the conversion.
*/
//Input:-
//Package Name:-
package Exception;
//Scanner Class:-
import java.util.Scanner;
//File Name:-
public class ConversionExceptionExample {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Try Block
        try {
        	//userInput
            System.out.print("Enter an integer as a string: ");
            String userInput = scanner.nextLine();
            if (userInput == null || userInput.trim().isEmpty()) {
                throw new NullPointerException("Input is null or empty.");//Throw Block
            }
            //Converted the userInput to a 
            int convertedValue = Integer.parseInt(userInput);
            System.out.println("Converted integer: " + convertedValue);
        }
        //NumberFormatException in Catch Block
        catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        } 
        //NullPointerException in Catch Block
        catch (NullPointerException e) {
            System.out.println("Input is null or empty. Please enter a valid input.");
        }
        //Finally Block
        finally {
            // It's good practice to close the scanner to prevent resource leaks
            scanner.close();//End of close Scanner Class
        }
    }
}
//Output:-
//Converted Integer Output:-
/*
Enter an integer as a string: 15
Converted integer: 15
*/
//NumberFormatException Output:-
/*
Enter an integer as a string: abcd
Invalid input. Please enter a valid integer.
*/
//NullPointerException Output:-
/*
Enter an integer as a string: 
Input is null or empty. Please enter a valid input.
 */