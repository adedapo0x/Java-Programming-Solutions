package Chapter_2;

import  java.util.Scanner;

/*
 * (Physics: acceleration) Average acceleration is defined as the change of velocity 
    divided by the time taken to make the change, as given by the following formula:
    a = (v1 - v0) / t
    Write a program that prompts the user to enter the starting velocity v0 in meters/
    second, the ending velocity v1 in meters/second, and the time span t in seconds, 
    then displays the average acceleration
 */

public class Question2_09 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in); // Creates Scanner object

      System.out.println("Program to calculate average acceleration");
      System.out.print("Enter v0, v1 and t: ");
      double v0 = input.nextDouble(), v1 = input.nextDouble(), t = input.nextDouble();

      double acceleration = (v1 - v0) / t;
      System.out.printf("The average acceleration is " + "%.4f", acceleration);
      input.close();
    }
}
