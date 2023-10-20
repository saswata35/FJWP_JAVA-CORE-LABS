//Question No:-2
/*
 Write a Java program that performs addition of two matrices. The
program should use a 2D array of wrapper class objects (e.g., Integer) for
the matrix elements. Take two matrices as input, perform the addition
operation, and display the resulting matrix.
*/
//Input:-
package Array;
//Scanner Class:-
import java.util.Scanner;
//Main Class Name:-
public class MatrixAddition {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input matrix dimensions
        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of columns: ");
        int columns = scanner.nextInt();

        // Input first matrix
        System.out.println("Enter the elements of the first matrix:");
        Integer[][] matrix1 = readMatrix(rows, columns);

        // Input second matrix
        System.out.println("Enter the elements of the second matrix:");
        Integer[][] matrix2 = readMatrix(rows, columns);

        // Perform matrix addition
        Integer[][] resultMatrix = addMatrices(matrix1, matrix2);

        // Display the result
        System.out.println("Resultant Matrix after addition:");
        displayMatrix(resultMatrix);

        scanner.close();
    }

    // Function to read a matrix from the user
    private static Integer[][] readMatrix(int rows, int columns) {
        Scanner scanner = new Scanner(System.in);
        Integer[][] matrix = new Integer[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + (i + 1) + ", " + (j + 1) + "): ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        return matrix;
    }

    // Function to add two matrices
    private static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int columns = matrix1[0].length;

        Integer[][] resultMatrix = new Integer[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return resultMatrix;
    }

    // Function to display a matrix
    private static void displayMatrix(Integer[][] matrix) {
        for (Integer[] row : matrix) {
            for (Integer value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
//Output:-
/*
Enter the dimensions of the matrices:
Number of rows: 2
Number of columns: 2
Enter the elements of the first matrix:
Enter element at position (1, 1): 8
Enter element at position (1, 2): 4
Enter element at position (2, 1): 7
Enter element at position (2, 2): 5
Enter the elements of the second matrix:
Enter element at position (1, 1): 3
Enter element at position (1, 2): 2
Enter element at position (2, 1): 8
Enter element at position (2, 2): 9
Resultant Matrix after addition:
11 6 
15 14 
*/