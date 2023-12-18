package Chapter_03;
import java.util.Scanner;

/*
 * (Compute the perimeter of a triangle) Write a program that reads three edges for 
    a triangle and computes the perimeter if the input is valid. Otherwise, display 
    that the input is invalid. The input is valid if the sum of every pair of two edges is 
    greater than the remaining edge
 */

public class Question3_19 {
    public static void main(String[] args) {
        System.out.println("Program to calculate perimeter of a triangle.");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter sides of the triangle(s1, s2, s3) separated by a space: ");
        double s1 = input.nextDouble();
        double s2 = input.nextDouble();
        double s3 = input.nextDouble();
        input.close();
        double perimeter;

        if (s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1){
            perimeter = s1 + s2 + s3;
            System.out.println("Perimeter is " + perimeter);
        } else {
            System.out.println("Invalid input");
        }
    }
}
