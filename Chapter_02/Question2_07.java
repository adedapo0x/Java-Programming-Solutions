package Chapter_02;
import java.util.Scanner;

/*
 * (Find the number of years) Write a program that prompts the user to enter the 
    minutes (e.g., 1 billion), and displays the maximum number of years
    and remaining days for the minutes.
 */
 
public class Question2_07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525_600;  // Divides by 525,600 since 1 year(365 days) has 525,600 minutes
        int remainder = minutes % 525_600;  // Gets the remainder of the minutes after maximum year(s) has been gotten
        int days = remainder / 1440;  // Calculates rest of days from remaining minutes

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        input.close();

    }    
}
