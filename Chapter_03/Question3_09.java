package Chapter_03;
import java.util.Scanner;

/*
    * (Business: check ISBN-10) An ISBN-10 (International Standard Book Number) 
    consists of 10 digits: d1d2d3d4d5d6d7d8d9d10. The last digit, d10, is a checksum, 
    which is calculated from the other 9 digits using the following formula:
    (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
    d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9),11
    If the checksum is 10, the last digit is denoted as X according to the ISBN-10 
    convention. Write a program that prompts the user to enter the first 9 digits and 
    displays the 10-digit ISBN (including leading zeros). Your program should read 
    the input as an integer
 */

public class Question3_09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first 9 digits of an ISBN as integer: ");
        int digits = input.nextInt();
        input.close();

        int d9 = digits % 10;
        int d8 = digits / 10 % 10;
        int d7 = digits / 100 % 10;
        int d6 = digits / 1000 % 10;
        int d5 = digits / 10_000 % 10;
        int d4 = digits / 100_000 % 10;
        int d3 = digits / 1_000_000 % 10;
        int d2 = digits / 10_000_000 % 10;
        int d1 = digits / 100_000_000 % 10;

        int checkSum = (d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
        char charVal;
        if (checkSum == 10){
            charVal = 'X';
            System.out.printf("The ISBN-10 number is %9d%s", digits, charVal);
        } else {
            
            System.out.printf("The ISBN-10 number is %s", digitsStr + newSum);
        }        

//         Scanner scanner = new Scanner(System.in);

//         // Prompt the user to enter the first 9 digits of the ISBN
//         System.out.print("Enter the first 9 digits of the ISBN: ");
//         int firstNineDigits = scanner.nextInt();

//         // Calculate the checksum
//         int checksum = 0;
//         int temp = firstNineDigits;
//         for (int i = 9; i >= 1; i--) {
//             int digit = temp % 10;
//             checksum += digit * i;
//             temp /= 10;
//         }

//         // Calculate the last digit
//         int lastDigit = checksum % 11;
//         char lastChar;
//         if (lastDigit == 10) {
//             lastChar = 'X';
//         } else {
//             lastChar = (char) (lastDigit);
//         }

//         // Display the 10-digit ISBN
//         String isbn = String.format("%09d", firstNineDigits);
//         System.out.println("The 10-digit ISBN is: " + isbn);

//         scanner.close();
//     }
// }

    }
}
