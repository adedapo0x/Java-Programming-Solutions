package Chapter_2;
import java.util.Scanner;

/*
 * (Science: wind-chill temperature) How cold is it outside? The temperature alone is 
    not enough to provide the answer. Other factors including wind speed, relative humidity, and sunshine play important roles in determining coldness outside. In 2001, 
    the National Weather Service (NWS) implemented the new wind-chill temperature 
    to measure the coldness using temperature and wind speed. The formula is
    twc = 35.74 + 0.6215ta - 35.75v0.16 + 0.4275tav0.16
    where ta is the outside temperature measured in degrees Fahrenheit, v is the speed 
    measured in miles per hour, and twc is the wind-chill temperature. The formula cannot 
    be used for wind speeds below 2 mph or temperatures below -58°F or above 41°F.
    Write a program that prompts the user to enter a temperature between -58°F
    and 41°F and a wind speed greater than or equal to 2 then displays the wind-chill 
    temperature. Use Math.pow(a, b) to compute v0.16
.
 */

public class Question2_17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Note that conditinal statements such as if statements were not used here 
        // to test the input of the user as it has not yet been introduced in the book.
        
        System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
        double temp = input.nextDouble();
        System.out.print("Enter wind speed (>= 2) in miles per hour: ");
        double speed = input.nextDouble();
        input.close();

        double windChill = 35.74 + (0.6215 * temp) - (35.75 * Math.pow(speed, 0.16)) + (0.4275 * temp * Math.pow(speed, 0.16));
        System.out.printf("The wind chill index is " + "%.5f", windChill);
    }
}
