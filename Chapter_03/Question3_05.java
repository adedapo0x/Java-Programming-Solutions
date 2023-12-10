package Chapter_03;
import java.util.Scanner;

/*
    * Write a program that prompts the user to enter an integer for 
    today’s day of the week (Sunday is 0, Monday is 1, . . . , and Saturday is 6). Also 
    prompt the user to enter the number of days after today for a future day and display the future day of the week.
 */

public class Question3_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Note that arrays are best suited to solve this problem and avoid repetition 
        // but it has not yet been treated in the book.

        System.out.print("Enter today's day(Sunday is 0, Monday is 1, . . . , and Saturday is 6): ");
        int day = input.nextInt();
        String weekDay = ""; 
        switch (day) {
            case 0:
                weekDay = "Sunday";
                break;
            case 1:
                weekDay = "Monday";
                break;
            case 2:
                weekDay = "Tuesday";
                break;
            case 3:
                weekDay = "Wednesday";
                break;
            case 4:
                weekDay = "Thursday";
                break;
            case 5:
                weekDay = "Friday";
                break;
            case 6:
                weekDay = "Saturday";
                break;
            default:
                System.out.println("Incorrect number day. Please try again.");
                System.exit(1);
        }

        System.out.print("Enter the numbers of days elapsed since today: ");
        int futureDays = input.nextInt();
        int weekNum = (day + futureDays) % 7;
        String futureWeekDays = "";
        
        switch (weekNum) {
            case 0:
                futureWeekDays = "Sunday";
                break;
            case 1:
                futureWeekDays = "Monday";
                break;
            case 2:
                futureWeekDays = "Tuesday";
                break;
            case 3:
                futureWeekDays = "Wednesday";
                break;
            case 4:
                futureWeekDays = "Thursday";
                break;
            case 5:
                futureWeekDays = "Friday";
                break;
            case 6:
                futureWeekDays = "Saturday";
                break;
        }
        System.out.printf("Today is %s and the future day is %s", weekDay, futureWeekDays);       
        input.close();
    }
}
