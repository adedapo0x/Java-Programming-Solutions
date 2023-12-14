package Chapter_03;
import java.util.Scanner;

/*
 * (Game: lottery) Revise Listing 3.8, Lottery.java, to generate a lottery of a threedigit integer. The program prompts the user to enter a three-digit integer and 
    determines whether the user wins according to the following rules:
    1. If the user input matches the lottery number in the exact order, the award is 
    $10,000.
    2. If all digits in the user input match all digits in the lottery number, the award 
    is $3,000.
    3. If one digit in the user input matches a digit in the lottery number, the award 
    is $1,000
 */

public class Question3_15 {
    public static void main(String[] args) {
        int lottery = (int) (Math.random() * 1000);

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (three digits): ");
        int guess = input.nextInt();

        // Get digits from lottery
        int lotteryDigitOne = lottery / 100;
        int lotteryDigitTwo = lottery / 10 % 10;
        int lotteryDigitThree = lottery % 10;

        // Get digits from guess
        int guessDigitOne = guess / 100;
        int guessDigitTwo = guess / 10 % 10;
        int guessDigitThree = guess % 10;

        System.out.println("The lottery number is " + lottery);

        if (guess == lottery){
            System.out.println("Exact match: you win $10,000");
        }
    }
}
