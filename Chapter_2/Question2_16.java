package Chapter_2;
import java.util.Scanner;
/*
 * (Geometry: area of a hexagon) Write a program that prompts the user to enter the 
    side of a hexagon and displays its area. The formula for computing the area of a 
    hexagon is
    Area = 323
    2
    s
    2
    ,
    where s is the length of a side
 */
public class Question2_16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the side: ");
        double side = input.nextDouble();
        input.close();

        double area = (3 * Math.pow(3, 0.5) * Math.pow(side, 2)) / 2;
        System.out.printf("The area of the hexagon is " + "%.4f", area);
    }
}
