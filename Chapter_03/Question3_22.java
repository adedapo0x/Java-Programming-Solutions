package Chapter_03;

import java.util.Scanner;

/*
 * (Geometry: point in a circle?) Write a program that prompts the user to enter a 
    point (x, y) and checks whether the point is within the circle centered at (0, 0) 
    with radius 10. For example, (4, 5) is inside the circle and (9, 9) is outside the 
    circle, as shown in Figure 3.7a.
    (Hint: A point is in the circle if its distance to (0, 0) is less than or equal to 10. 
    The formula for computing the distance is 2(x2 - x1)
    2 + (y2 - y1)
    2
    . Test your 
    program to cover all cases.) 
 */

public class Question3_22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a point with two coordinates: ");
        double x2 = input.nextDouble(), y2 = input.nextDouble();

        // Calculates distance using formular given
        double distance = Math.sqrt(Math.pow(x2 - 0, 2) + Math.pow(y2 - 0, 2));
      
        if (distance <= 10){
            System.out.printf("Point (%.1f, %.1f) is in the circle.", x2, y2);
        } else {
            System.out.printf("Point (%.1f, %.1f) is not in the circle.", x2, y2);
        }
        input.close();
    }
}
