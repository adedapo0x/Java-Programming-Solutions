package Chapter_02;
import java.util.Scanner;

/*
    * (Geometry: area of a triangle) Write a program that prompts the user to enter 
    three points, (x1, y1), (x2, y2), and (x3, y3), of a triangle then displays 
    its area. The formula for computing the area of a triangle is
    s = (side1 + side2 + side3)/2;
    area = 2s(s - side1)(s - side2)(s - side3)
 */
public class Question2_19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the coordinates of three points separated by spaces like x1 y1 x2 y2 x3 y3: ");
        double x1 = input.nextDouble(), y1 = input.nextDouble(), x2 = input.nextDouble(), y2 = input.nextDouble(), x3 = input.nextDouble(), y3 = input.nextDouble();
        input.close();

        // Not done


    }
}
