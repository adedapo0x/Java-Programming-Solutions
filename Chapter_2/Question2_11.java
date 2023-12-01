package Chapter_2;
// More work to be done here

import java.util.Scanner;

/*
 * (Population projection) Rewrite Programming Exercise 1.11 to prompt the user 
    to enter the number of years and display the population after the number of years. 
 */

public class Question2_11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years: ");
        int numberOfYears = input.nextInt();

        int secondsInAYear = 365 * 24 * 60 * 60;
        float birthRate = secondsInAYear / 7.0F;
        float deathRate = secondsInAYear / 13.0F;
        float immigrantRate = secondsInAYear / 45.0F;

        int currentPopulation = 312_032_486;
        for (int x = 0; x < numberOfYears ; x++){
            currentPopulation += birthRate - deathRate + immigrantRate;
        }
        System.out.println("The population in " + numberOfYears + " years is " + currentPopulation);
        input.close();
    }
}
