//Question-1:-
/*Write a program to find out all the armstrong numbers within a given
range using a method named printArmstrongNumber( int start, int
end) by taking input from the user. The program should print the
Armstrong number in a given range starting from “start” and ending
with “end”.
Armstrong Number Example: 153 13+53+33 =153 (Number which is equal
to the sum of the cubes of its digits)
Note: input should be taken from the keyboard. Use a loop to calculate the
Armstrong number from “start” to “end”. Also use loops to calculate the
cube of a number. Do not use the Math.pow() function.
*/
//Input:-
//Package Name:-
package ArmstrongNumbers_java;

import java.util.Scanner;
//Class Name:-
public class ArmstrongNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the start of the range: ");
        int start = input.nextInt();

        System.out.print("Enter the end of the range: ");
        int end = input.nextInt();

        input.close();

        System.out.println("Armstrong numbers in the range " + start + " to " + end + ":");
        printArmstrongNumber(start, end);
    }

    public static void printArmstrongNumber(int start, int end) {
        for (int number = start; number <= end; number++) {
            if (isArmstrongNumber(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isArmstrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += (digit * digit * digit);
            num /= 10;
        }

        return originalNum == sum;
    }
}
//Output:-
/*Enter the start of the range: 0
Enter the end of the range: 1000
Armstrong numbers in the range 0 to 1000:
0
1
153
370
371
407
*/