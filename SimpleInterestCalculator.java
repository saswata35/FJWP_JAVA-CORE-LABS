/*Question-1:-
 Write a program to enter P,T (principal and time) and calculate
simple interest. Use the Scanner class for taking inputs from the
console. Users will enter the principal amount and time(in years).
Create an if-else statement and modify the interest rate based on the
principal amount. If the amount > 10000 then the interest rate is 10%. If the
amount is between 10000 and 5000 then make the interest rate 8%. For
any amount below 5000 the interest rate should be 5%.
 */
/*Input*/
package SimpleInterestCalculator_java;

import java.util.Scanner;

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the time in years (T): ");
        double time = scanner.nextDouble();

        double interestRate;

        if (principal > 10000) {
            interestRate = 0.10;
        } else if (principal >= 5000 && principal <= 10000) {
            interestRate = 0.08;
        } else {
            interestRate = 0.05;
        }

        double simpleInterest = (principal * interestRate * time);
        
        System.out.println("Simple Interest: " + simpleInterest);
        
        scanner.close();
    }
}
/*Output:-*/
/*Enter the principal amount (P): 15000
Enter the time in years (T): 8
Simple Interest: 12000.0
*/
