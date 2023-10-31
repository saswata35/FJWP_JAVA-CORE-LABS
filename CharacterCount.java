//Question-2:-
/*
Write a Java program that counts the number of occurrences of a specific character in a given string. Prompt the user to enter a string and a character, and then display the count.
*/
//Input:-
//Package Name:-
package String;
//Scanner Class:-
import java.util.Scanner;
//File Name:-
public class CharacterCount {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char targetChar = scanner.next().charAt(0);

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Call the countOccurrences method to count the occurrences of the specified character
        int charCount = countOccurrences(inputString, targetChar);

        // Display the count of occurrences
        System.out.println("Number of occurrences of '" + targetChar + "': " + charCount);
    }

    // Method to count occurrences of a specific character in a given string
    private static int countOccurrences(String input, char targetChar) {
        int count = 0;

        // Iterate through each character in the string
        for (char ch : input.toCharArray()) {
            // Check if the current character is equal to the target character
            if (ch == targetChar) {
                count++;
            }
        }
        //return the count value
        return count;
    }
}
//Output:-1
/*
Enter a string: saswata banerjee
Enter a character: a
Number of occurrences of 'a': 4
*/
//Output-2:-
/*
Enter a string: Soma Banerjee
Enter a character: e
Number of occurrences of 'e': 3
*/