package Chapter_03;
import java.util.Scanner;

public class Question3_02 {
    public static void main(String[] args) {
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);
        int number3 = (int) (Math.random() * 10);

        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d + %d?: ",number1, number2, number3);
        int answer = input.nextInt();
        input.close();

        System.out.printf("%d + %d + %d = %d is " + (number1 + number2 + number3 == answer), number1, number2, number3, answer);
        
    }
}
