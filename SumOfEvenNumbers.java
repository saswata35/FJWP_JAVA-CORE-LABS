//Question-2:-
/*
Write a Java program that calculates the sum of all even numbers present
in an ArrayList of integers.
*/
//Input:-
//Package Name:-
package Set_Queues;
//ArrayList-ArrayList Class:-
import java.util.ArrayList;
//File Name:-
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        // Create an ArrayList of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Add integers to the ArrayList
        numbers.add(2);
        numbers.add(8);
        numbers.add(14);
        numbers.add(12);
        numbers.add(10);

        // Calculate the sum of even numbers
        int sumOfEvenNumbers = calculateSumOfEvenNumbers(numbers);

        // Display the result
        System.out.println("Sum of even numbers: " + sumOfEvenNumbers);
    }

    // Method to calculate the sum of even numbers in an ArrayList
    private static int calculateSumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;

        // Iterate through the ArrayList using an enhanced for loop
        for (int num : numbers) {
            // Check if the number is even
            if (num % 2 == 0) {
                // Add the even number to the sum
                sum += num;
            }
        }
        //Return Type
        return sum;
    }
}
//Output:-
/*
Sum of even numbers: 46
*/