package Chapter_03;
import java.util.Scanner;
/*
 * (Sort three integers) Write a program that prompts the user to enter three integers 
    and display the integers in non-decreasing order
 */
public class Question3_08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three integers: ");
        int num1 = input.nextInt(), num2 = input.nextInt(), num3 = input.nextInt();
        int largest, secondLargest, thirdLargest;

        // largest = num1;


        // if (num1 > num2 && num1 > num3)
        //     largest = num1;
        //     if (num2 > num3){
        //         secondLargest = num2;
        //         thirdLargest = num3;
        //     }
        //     else{
        //         secondLargest = num3;
        //         thirdLargest = num2;
        // else if (num2 > num1 && num2 > num3)
        //     largest = num2;
        // else 
        //     largest = num3;

    }
}
