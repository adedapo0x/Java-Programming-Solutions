package Chapter_03;
import java.util.Scanner;

/*
 * (Geometry: point in a rectangle?) Write a program that prompts the user to enter 
    a point (x, y) and checks whether the point is within the rectangle centered at 
    (0, 0) with width 10 and height 5. For example, (2, 2) is inside the rectangle and 
    (6, 4) is outside the rectangle, as shown in Figure 3.7b. (Hint: A point is in the 
    rectangle if its horizontal distance to (0, 0) is less than or equal to 10 / 2 and its 
    vertical distance to (0, 0) is less than or equal to 5.0 / 2. Test your program to 
    cover all cases.)
 */

public class Question3_23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.printf("Enter a point with two coordiantes: ");
        double x = input.nextDouble(), y = input.nextDouble();

        double distance = Math.sqrt(Math.pow(x - 0, 2) + Math.pow(y - 0, 2));

        if (distance <= (10 / 2)){
            System.out.printf("Point (%.2f, %.2f) is in the rectangle.", x, y);
        } else {
            System.out.printf("Point (%.2f, %.2f) is not in the rectangle.", x, y);
        }
        input.close();
    }
}
