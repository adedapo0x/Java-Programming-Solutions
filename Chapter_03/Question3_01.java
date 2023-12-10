package Chapter_03;
import java.util.Scanner;

/*
 * (Algebra: solve quadratic equations) The two roots of a quadratic equation 
    ax2 + bx + c = 0 can be obtained using the following formula:
    r1 = -b + 2b2 - 4ac
    2a
    and r2 = -b - 2b2 - 4ac
    2a
    b2 - 4ac is called the discriminant of the quadratic equation. If it is positive, the 
    equation has two real roots. If it is zero, the equation has one root. If it is negative, the equation has no real roots.
    Write a program that prompts the user to enter values for a, b, and c and displays 
    the result based on the discriminant. If the discriminant is positive, display two 
    roots. If the discriminant is 0, display one root. Otherwise, display “The equation 
    has no real roots.”
 */

public class Question3_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble(), b = input.nextDouble(), c = input.nextDouble();
        input.close();

        double discriminant = (Math.pow(b, 2) - (4 * a * c));

        if (discriminant > 0){
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double r2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);

            System.out.printf("The equation has two roots %f and %f", r1, r2);
        } else if (discriminant == 0){
            double r1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.printf("The equation has only one root %f", r1);
        } else {
            System.out.println("The eqaution has no real roots.");
        }
    } 
}
