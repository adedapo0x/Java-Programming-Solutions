package Chapter_02;

import java.util.Scanner;

/*
 * (Convert pounds into kilograms) Write a program that converts pounds into kilograms. The program prompts the user to enter a number in pounds, converts it 
        to kilograms, and displays the result. One pound is 0.454 kilogram
 */

public class Question2_04 {
    public static void main(String[] args) {
        System.out.println("Program to convert pounds to kilograms");

        Scanner input = new Scanner(System.in); // creates Scanner object
        System.out.print("Enter a number in pounds: ");
        double pounds = input.nextDouble();

        double kilograms = pounds * 0.454;

        System.out.println(pounds + " pounds is " + kilograms + " kilograms.");
        input.close();
    }
}
