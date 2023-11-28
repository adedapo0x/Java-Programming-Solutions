package Chapter_2;
import java.util.Scanner;

/*
 * (Financial application: calculate tips) Write a program that reads the subtotal 
    and the gratuity rate, then computes the gratuity and total. For example, if the 
    user enters 10 for subtotal and 15% for gratuity rate, the program displays $1.5
    as gratuity and $11.5 as total
 */
public class Question2_5{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the subtotal and gratuity rate: ");
        double subtotal = input.nextDouble(), rate = input.nextDouble();

        double gratuity = (rate / 100) * subtotal;
        double total = subtotal + gratuity;

        System.out.println("The gratuity is $" + gratuity + " and total is $" + total);

        input.close();

    }
}
