package Chapter_1;

/*
 * (Population projection) The U.S. Census Bureau projects population based on 
 *  the following assumptions:
 * ■ One birth every 7 seconds
 * ■ One death every 13 seconds
 * ■ One new immigrant every 45 seconds
 * Write a program to display the population for each of the next five years. Assume 
 *that the current population is 312,032,486, and one year has 365 days. Hint: In Java, 
 *if two integers perform division, the result is an integer. The fractional part is
 *truncated. For example, 5 / 4 is 1 (not 1.25) and 10 / 4 is 2 (not 2.5). To get an 
 * accurate result with the fractional part, one of the values involved in the division must be 
 *a number with a decimal point. For example, 5.0 / 4 is 1.25 and 10 / 4.0 is 2.5.
 */

public class Question1_11 {
    public static void main(String[] args) {
        float secondsInAYear = 365 * 24 * 60 * 60;
        float birthRate = secondsInAYear / 7.0F;
        float deathRate = secondsInAYear / 13.0F;
        float immigrantRate = secondsInAYear / 45.0F;


        float currentPopulation = 312_032_486;
        for (int x = 1; x <= 5; x++){
            currentPopulation += birthRate - deathRate + immigrantRate;
            System.out.print("The current population for year " + x + " is ");
            System.out.printf("%1.0f\n", currentPopulation);
         }
    }
}
