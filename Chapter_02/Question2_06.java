package Chapter_02;
import java.util.Scanner;

/*
 * (Sum the digits in an integer) Write a program that reads an integer between 0
    and 1000 and adds all the digits in the integer. For example, if an integer is 932, 
    the sum of all its digits is 14.
    Hint: Use the % operator to extract digits, and use the / operator to remove the 
    extracted digit. For instance, 932 % 10 = 2 and 932 / 10 = 93
 */

public class Question2_06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer between 0 and 1000: ");
        int number = input.nextInt();

        int thousand = number / 1000;
        int thousRemainder = number % 1000;

        int hundred = thousRemainder / 100;
        int hundredRemainder = thousRemainder % 100;

        int tens = hundredRemainder / 10;
        int tensRemainder = hundredRemainder % 10;
        
        int total = thousand + hundred + tens + tensRemainder;

        System.out.println("Sum of the digits is " + total);

        input.close();


    }
}
