package Chapter_02;

import java.util.Scanner;
/*
    (Geometry: distance of two points) Write a program that prompts the user to 
    enter two points (x1, y1) and (x2, y2) and displays their distance. The formula for computing the distance is 2(x2 - x1)
    2 + (y2 - y1)
    2
    . Note you can use 
    Math.pow(a, 0.5) to compute 2a
 */

public class Question2_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        input.close();

        double xcalc = Math.pow((x2 - x1), 2);
        double ycalc = Math.pow((y2 - y1), 2);
        double distance = Math.pow((xcalc + ycalc), 0.5);
        System.out.println("The distance between the two points is " + distance);

    }
}
