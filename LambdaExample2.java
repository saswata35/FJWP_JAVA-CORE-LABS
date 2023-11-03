//Question-2:-
/*
Write a Java program that uses lambda expressions to manipulate strings. Create lambda
expressions to perform the following operations on a given string:
● Convert the string to uppercase
● Convert the string to lowercase
● Reverse the string
*/
//Input:-
package Lambda_Function;
//Function Class:-
import java.util.function.Function;
//File Name:-
public class StringManipulation {
    public static void main(String[] args) {
        // Sample input string
        String inputString = "Hello, Lambda Expressions!";

        // Lambda expression to convert the string to uppercase
        Function<String, String> toUpperCase = str -> str.toUpperCase();
        String uppercased = manipulateString(inputString, toUpperCase);
        System.out.println("Uppercase: " + uppercased);

        // Lambda expression to convert the string to lowercase
        Function<String, String> toLowerCase = str -> str.toLowerCase();
        String lowercased = manipulateString(inputString, toLowerCase);
        System.out.println("Lowercase: " + lowercased);

        // Lambda expression to reverse the string
        Function<String, String> reverseString = str -> new StringBuilder(str).reverse().toString();
        String reversed = manipulateString(inputString, reverseString);
        System.out.println("Reversed: " + reversed);
    }

    // Method to apply the given lambda expression on the input string
    private static String manipulateString(String input, Function<String, String> stringManipulator) {
        return stringManipulator.apply(input);
    }
}
//Output:-
/*
Uppercase: HELLO, LAMBDA EXPRESSIONS!
Lowercase: hello, lambda expressions!
Reversed: !snoisserpxE adbmaL ,olleH
*/