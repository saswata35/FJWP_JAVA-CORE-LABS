//Question-1:-
/*
Write a Java program that takes an array of integers as input from the user and
then calculates the sum and average of the elements in the array. The program
should output the sum and average.
 */
//Input:-
//package name:-
package Array;
//scanner package:-
import java.util.Scanner;
//class name:-
public class Array {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the size of the array from the user
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Get array elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum and average
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / size;

        // Display the sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
//Output:-
/*Enter the size of the array: 5
Enter the elements of the array:
Element 1: 24
Element 2: 12
Element 3: 48
Element 4: 36
Element 5: 60
Sum: 180
Average: 36.0*/