//Question No:--1
/*
 * Write a Java program that demonstrates various operations on a 3D
array:
1. Initializing the 3D array with random values.
2. Finding the maximum value in the array.
3. Calculating the average of all elements.
4. Displaying the array.
*/
//Input:-
//Package Name:-
package Array;
//Random Class:- 
import java.util.Random;
//Scanner Class:-
import java.util.Scanner;
//Main Class Name:-
public class ThreeDArray {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //level
        System.out.println("Enter the level:");
    	// Specify the dimensions of the 3D array
        int level=sc.nextInt();
        //rows
        System.out.println("Enter the rows:");
        int rows=sc.nextInt();
        //columns
        System.out.println("Enter the columns:");
        int columns=sc.nextInt();

        // Step 1: Initializing the 3D array with random values
        int[][][] threeDArray = initializeArray(level, rows, columns);

        // Step 2: Finding the maximum value in the array
        int maxValue = findMaxValue(threeDArray);
        System.out.println("Maximum value in the array: " + maxValue);

        // Step 3: Calculating the average of all elements
        double average = calculateAverage(threeDArray);
        System.out.println("Average of all elements: " + average);

        // Step 4: Displaying the array
        displayArray(threeDArray);
    }

    // Function to initialize the 3D array with random values
    private static int[][][] initializeArray(int level, int rows, int columns) {
        int[][][] array = new int[level][rows][columns];
        Random random = new Random();

        for (int d = 0; d < level; d++) {
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    array[d][i][j] = random.nextInt(100); // Adjust the range as needed
                }
            }
        }

        return array;
    }

    // Function to find the maximum value in the 3D array
    private static int findMaxValue(int[][][] array) {
        int maxValue = Integer.MIN_VALUE;

        for (int[][] rowArray : array) {
            for (int[] colArray : rowArray) {
                for (int value : colArray) {
                    if (value > maxValue) {
                        maxValue = value;
                    }
                }
            }
        }

        return maxValue;
    }

    // Function to calculate the average of all elements in the 3D array
    private static double calculateAverage(int[][][] array) {
        double sum = 0;
        int count = 0;

        for (int[][] rowArray : array) {
            for (int[] colArray : rowArray) {
                for (int value : colArray) {
                    sum += value;
                    count++;
                }
            }
        }

        return sum / count;
    }

    // Function to display the 3D array
    private static void displayArray(int[][][] array) {
        for (int[][] rowArray : array) {
            for (int[] colArray : rowArray) {
                for (int value : colArray) {
                    System.out.print(value + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
//Output:-
/*
Enter the level:
3
Enter the rows:
2
Enter the columns:
2
Maximum value in the array: 95
Average of all elements: 64.25
92 36 
71 46 

78 35 
56 55 

95 24 
94 89 
*/