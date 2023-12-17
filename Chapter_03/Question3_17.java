package Chapter_03;
import java.util.Scanner;

/*
 * (Game: scissor, rock, paper) Write a program that plays the popular scissor–
    rock–paper game. (A scissor can cut a paper, a rock can knock a scissor, and 
    a paper can wrap a rock.) The program randomly generates a number 0, 1, or 
    2 representing scissor, rock, and paper. The program prompts the user to enter 
    a number 0, 1, or 2 and displays a message indicating whether the user or the 
    computer wins, loses, or draws
 */

public class Question3_17 {
    public static void main(String[] args) {
        System.out.println("A Rock-Paper-Scissors game.");
        Scanner input = new Scanner(System.in);
        System.out.print("scissor (0), rock (1), paper (2): ");
        int choice = input.nextInt();
        String status = "";
        // implements a list to assign values to index(number)
        String[] names = {"scissors", "rock", "paper"}; 
        if (choice > 2 || choice < 0){
            System.out.println("Wrong choice. Run program to try again.");
            System.exit(1);
        } else{
            int random = (int)(Math.random() * 3);
            if (choice == 0 && random == 2){
                status = "You won";
            } else if (choice == 1 && random == 0){
                status = "You won";
            } else if (choice == 2 && random == 1){
                status = "You won";
            } else if (choice == random){
                status = "It is a draw";
                System.out.println("The computer is " + names[random]+ ". You are " + names[choice] + " too. " + status);
                System.exit(1);
            } else {
                status = "You lost";
            }
            System.out.println("The computer is " + names[random]+ ". You are " + names[choice] + ". " + status);
        } 

    }
}
