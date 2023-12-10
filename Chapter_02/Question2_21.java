package Chapter_02;
import java.util.Scanner;

/*
 * (Financial application: calculate future investment value) Write a program that 
    reads in investment amount, annual interest rate, and number of years and displays the future investment value using the following formula:
    futureInvestmentValue =
    investmentAmount * (1 + monthlyInterestRate)
    numberOfYears*12
    For example, if you enter amount 1000, annual interest rate 3.25%, and number 
    of years 1, the future investment value is 1032.98.
 */

public class Question2_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();
        System.out.print("Enter annual interest rate in percentage: ");
        double rate = input.nextDouble();
        System.out.print("Enter number of years: ");
        int noOfYears = input.nextInt();
        input.close();

        double futureValue = investment * Math.pow((1 + rate/12), (noOfYears * 12));
        System.out.printf("Future value is $" + "%.3f", futureValue);

    }
}
