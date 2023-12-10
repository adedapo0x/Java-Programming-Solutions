package Chapter_01;

/*
 * (Average speed in miles) Assume that a runner runs 14 kilometers in 45 minutes 
 *  and 30 seconds. Write a program that displays the average speed in miles per 
 *  hour. (Note 1 mile is equal to 1.6 kilometers.)
 */

public class Question1_10 {
    public static void main(String[] args) {
        int totalSeconds = (45 * 60) + 30; 
        double hour = (double) totalSeconds / 3600; // Convert 45 minutes and 30 seconds into hour
        double mile = 14 / 1.6;  // Convert kilometers to mile
        double milePerHour = mile / hour;
        System.out.println("Average speed(miles per hour) is: " + milePerHour);
    }    
}
