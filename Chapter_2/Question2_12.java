package Chapter_2;

import java.util.Scanner;

/*
 * (Physics: finding runway length) Given an airplane’s acceleration a and take-off 
    speed v, you can compute the minimum runway length needed for an airplane to 
    take off using the following formula:
    length = v ^ 2 / 2a
    Write a program that prompts the user to enter v in meters/second (m/s) and 
    the acceleration a in meters/second squared (m/s
    2
    ), then, displays the minimum 
    runway length
 */
public class Question2_12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // Creates Scanner object

        System.out.print("Enter speed and acceleration: ");
        double v = input.nextDouble(), a = input.nextDouble();

        double length = (v * v) / (2 * a);

        System.out.printf("The minimum runway length for this airplane is " + "%.4f", length);
        input.close();

    }
}
