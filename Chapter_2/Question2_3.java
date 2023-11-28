package Chapter_2;

import java.util.Scanner; 

/*
 * (Convert feet into meters) Write a program that reads a number in feet, converts it 
    to meters, and displays the result. One foot is 0.305 meter. 
 */

public class Question2_3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter number in feet: ");
        double feet = input.nextDouble();

        double meters = feet * 0.305;

        System.out.println(feet + " feet in metres is " + meters + " metres.");
        input.close();
    }
}
