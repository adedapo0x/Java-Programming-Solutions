package Chapter_1;

/*
 * (Average speed in kilometers) Assume that a runner runs 24 miles in 1 hour, 40
 *  minutes, and 35 seconds. Write a program that displays the average speed in 
 *  kilometers per hour. (Note 1 mile is equal to 1.6 kilometers.)
 */

public class Question1_12 {
    public static void main(String[] args) {
        double minToHour = 40.0 / 60; // Convert minutes to hour
        double secondsToHour = 35.0 / 3600;  // Convert seconds to hour
        double totalHours = 1 + minToHour + secondsToHour;

        double noOfKilometres = 24 * 1.6;
        double average = noOfKilometres / totalHours;
        System.out.println("The average speed in kilometres is " + average);
    }
}
