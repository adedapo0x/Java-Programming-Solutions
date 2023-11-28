package Chapter_2;

import java.util.Scanner;

/*
 * (Compute the volume of a cylinder) Write a program that reads in the radius 
    and length of a cylinder and computes the area and volume using the following 
    formulas:
        area = radius * radius * π
        volume = area * length
 */

public class Question2_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); // creates Scanner object

        System.out.println("Program to find the volume of a cylinder");
        System.out.print("Enter radius and length of cylinder: ");
        double radius = input.nextDouble(), length = input.nextDouble();

        double area = radius * radius * Math.PI; // utilizes the inbuilt Math.PI
        double volume = area * length;

        System.out.printf("Area is " + "%.4f\n", area);
        System.out.printf("Area of cylinder is " + "%.3f", volume);
        input.close();

    }
}
