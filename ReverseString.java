//Question-1:-
/*
Write a Java program to reverse a given string. Prompt the user to enter a string and display its reverse.
*/
//Input:-
//Package Name:-
package String;
//Scanner Class
import java.util.Scanner;
//File Name:-
public class ReverseString {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Call the reverseString method to reverse the entered string
        String reversedString = reverseString(inputString);

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString);
    }

    // Method to reverse a given string
    private static String reverseString(String input) {
        // Convert the string to a char array
        char[] charArray = input.toCharArray();

        // Reverse the char array
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            char temp = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = temp;
        }

        // Convert the char array back to a string
        return new String(charArray);
    }
}
//Output-1:-
/*
Enter a string: saswata banerjee
Reversed string: eejrenab atawsas
*/
//Output-2:-
/*
Enter a string: saswata0124@gmail.com
Reversed string: moc.liamg@4210atawsas
*/