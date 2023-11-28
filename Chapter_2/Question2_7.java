package Chapter_2;
import java.util.Scanner;

/*
 * (Find the number of years) Write a program that prompts the user to enter the 
    minutes (e.g., 1 billion), and displays the maximum number of years
    and remaining days for the minutes.
 */
 
public class Question2_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / 525_600;
        int remainder = minutes % 525_600;
        int days = remainder / 1440;

        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        input.close();

    }    
}
