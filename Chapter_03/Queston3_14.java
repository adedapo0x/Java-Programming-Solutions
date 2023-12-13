package Chapter_03;
import java.util.Scanner;
import java.util.Random;

/*
 * (Game: heads or tails) Write a program that lets the user guess whether the flip 
    of a coin results in heads or tails. The program randomly generates an integer 
    0 or 1, which represents head or tail. The program prompts the user to enter a 
    guess, and reports whether the guess is correct or incorrect
 */

public class Queston3_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int result = random.nextInt(2);
        System.out.print("Enter a guess for a coin flip (0 for head, 1 for tail): ");
        int guess = input.nextInt();
        if (guess < 0 || guess > 1){
            System.out.println("Invalid selection. Try again");
            System.exit(1);
        } else {
            if (guess == result){
                System.out.println("Guess is correct!");
            } else{
                System.out.println("Guess is wrong. Please try again.");
            }
        }
        input.close();
    }
    
}
