/*Question-2
 Write a program to enter marks of five subjects and calculate total
marks and average. Each subject has a full mark of 100. Give grades
based on average marks. Grades should be Ex (>90%), A (>80%) ,
B(>60%) ,C (>=40%) and F(<40%). Use the Scanner class to take
inputs from the console.
 */
/*Input:-*/
package GradeCalculator_java;

import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMarks = 500; // Total marks for 5 subjects (100 each)

        System.out.println("Enter marks for five subjects:");
        int sumOfMarks = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks for subject " + i + ": ");
            int marks = scanner.nextInt();
            sumOfMarks += marks;
        }

        double average = (double) sumOfMarks / 5;

        System.out.println("Total Marks: " + sumOfMarks);
        System.out.println("Average Marks: " + average);

        if (average > 90) {
            System.out.println("Grade: Ex");
        } else if (average > 80) {
            System.out.println("Grade: A");
        } else if (average > 60) {
            System.out.println("Grade: B");
        } else if (average >= 40) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: F");
        }

        scanner.close();
    }
}
/*Output:-*/
/*Enter marks for subject 3: 60
Enter marks for subject 4: 36
Enter marks for subject 5: 24
Total Marks: 220
Average Marks: 44.0
Grade: C*/