package Chapter_02;

import java.util.Scanner;

/*
    (Financial application: compound value) Suppose you save $100 each month into 
    a savings account with an annual interest rate of 5%. Thus, the monthly interest 
    rate is 0.05/12 = 0.00417. After the first month, the value in the account becomes
    100 * (1 + 0.00417) = 100.417
    After the second month, the value in the account becomes
    (100 + 100.417) * (1 + 0.00417) = 201.252
    After the third month, the value in the account becomes
    (100 + 201.252) * (1 + 0.00417) = 302.507
    and so on.
    Write a program that prompts the user to enter a monthly saving amount and displays
    the account value after the sixth month. (In Programming Exercise 5.30, you 
    will use a loop to simplify the code and display the account value for any month.)
 */
public class Question2_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the monthly saving amount: ");
        double savings = input.nextDouble();
        input.close();
        
        double calc = 1 + 0.00417; // Stores 1 + 0.00417 in variable for easier access
        double firstMonth = savings * calc;
        double secondMonth = (savings + firstMonth) * calc;
        double thirdMonth = (savings + secondMonth) * calc;
        double fourthMonth = (savings + thirdMonth) * calc;
        double fifthMonth = (savings + fourthMonth) * calc;
        double sixthMonth = (savings + fifthMonth) * calc;

        System.out.printf("After the sixth month, the account value is $" + "%.2f", sixthMonth);

    }
}
