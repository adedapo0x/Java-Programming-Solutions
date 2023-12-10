package Chapter_02;

import java.util.Scanner;

/*
 *  (Convert Celsius to Fahrenheit) Write a program that reads a Celsius degree in a 
double value from the console, then converts it to Fahrenheit, and displays the 
result. The formula for the conversion is as follows:
fahrenheit = (9 / 5) * celsius + 32
Hint: In Java, 9 / 5 is 1, but 9.0 / 5 is 1.8.
 */

public class Question2_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // create object of Scanner
        System.out.println("This is a program to convert Celsius to Farenheit");

        System.out.print("Enter a temperature value in Celsius: "); // prompts user to enter input
        double celsTemp = input.nextDouble();

        double fahrenTemp = (9.0 / 5) * celsTemp + 32;

        System.out.println(celsTemp + " Celsius is " + fahrenTemp + " in Fahrenheit.");

        input.close();
    }    
}
