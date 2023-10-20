//Question-2:-
/*
 * Write a Java program that takes an array of integers as input and sorts it in
ascending order using any sorting algorithm of your choice. Print the sorted
array
*/
//Input:-
//package name:-
package Array;
//Array Package:-
import java.util.Arrays;
//Scanner Package:-
import java.util.Scanner;
//class name:-
public class Array1 {
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

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted array
        System.out.println("Sorted Array: " + Arrays.toString(numbers));

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
//Output:-
/*
Enter the size of the array: 4
Enter the elements of the array:
Element 1: 24
Element 2: 12
Element 3: 48
Element 4: 36
Sorted Array: [12, 24, 36, 48]
*/