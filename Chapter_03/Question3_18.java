package Chapter_03;
import java.util.Scanner;

/*
 * (Cost of shipping) A shipping company uses the following function to calculate 
    the cost (in dollars) of shipping based on the weight of the package (in pounds).
    c(w) = d
    3.5, if 0 6 w 6 = 1
    5.5, if 1 6 w 6 = 3
    8.5, if 3 6 w 6 = 10
    10.5, if 10 6 w 6 = 20
    Write a program that prompts the user to enter the weight of the package and 
    displays the shipping cost. If the weight is negative or zero, display a message 
    “Invalid input.” If the weight is greater than 20, display a message “The package 
    cannot be shipped.”

 */

public class Question3_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cost;
        System.out.print("Enter weight of package in pounds: ");
        double weight = input.nextDouble();
        input.close();

        if (weight <= 0){
            System.out.println("Invalid input.");
        } else if(weight > 20){
            System.out.println("The package cannot be shipped.");
        } else{
            if (weight > 0 && weight <= 1){
                cost = 3.5;
            } else if (weight > 1 && weight <= 3){
                cost = 5.5;
            } else if (weight > 3 && weight <= 10){
                cost = 8.5;
            } else {
                cost = 10.5;
            }
            System.out.println("Cost of " + weight + " pounds is " + cost);

        }
    }    
}
