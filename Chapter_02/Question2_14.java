package Chapter_02;

import java.util.Scanner;

/*
 * (Health application: computing BMI) Body Mass Index (BMI) is a measure of 
    health on weight. It can be calculated by taking your weight in kilograms and dividing, by the square of your height in meters. Write a program that prompts the user to 
    enter a weight in pounds and height in inches and displays the BMI. Note one pound 
    is 0.45359237 kilograms and one inch is 0.0254 meters. 
 */

public class Question2_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = input.nextDouble();

        System.out.print("Enter height in inches: ");
        double heightInInches = input.nextDouble();

        input.close();

        double weightInKIlograms = weightInPounds *  0.45359237;
        double heightInMeters = heightInInches *  0.0254;

        double bmi = weightInKIlograms / (heightInMeters * heightInMeters);

        System.out.printf("BMI is " + "%.4f", bmi);

    }

}
