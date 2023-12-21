package Chapter_03;
import java.util.Scanner;

/*
 * (Science: day of the week) Zeller’s congruence is an algorithm developed by 
    Christian Zeller to calculate the day of the week. The formula is
    h = aq +
    26(m + 1)
    10
    + k +
    k
    4
    + j
    4
    + 5jb,7
    where
    ■ h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: 
    Wednesday, 5: Thursday, and 6: Friday).
    ■ q is the day of the month.
    ■ m is the month (3: March, 4: April, ..., 12: December). January and February 
    are counted as months 13 and 14 of the previous year.
    ■ j is year
    100
    .
    ■ k is the year of the century (i.e., year % 100).
    Note all divisions in this exercise perform an integer division. Write a program 
    that prompts the user to enter a year, month, and day of the month, and displays 
    the name of the day of the week.
 */

public class Question3_21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: (e.g 2012): ");
        int year = input.nextInt();
        System.out.print("Enter month: 1-12: ");
        int month = input.nextInt();
        System.out.print("Enter the day of the month: 1-31: ");
        int q = input.nextInt();
        int m;

        if (month == 1){
            m = 13;
            year -= 1;
        } else if (month == 2){
            m = 14;
            year -= 1;
        } else {
            m = month;
        }

        int j = year / 100;
        int k = year % 100;

        int h = (q + (26 * (m + 1) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String weekDay = "";

        switch (h) {
            case 0:
                weekDay += "Saturday";
                break;
            case 1:
                weekDay += "Sunday";
                break;
            case 2:
                weekDay += "Monday";
                break;
            case 3:
                weekDay += "Tuesday";
                break;
            case 4:
                weekDay += "Wednesday";
                break;
            case 5:
                weekDay += "Thursday";
                break;
            case 6:
                weekDay += "Friday";
                break;  
        }
        System.out.println("Day of the week is " + weekDay);
    }
}
