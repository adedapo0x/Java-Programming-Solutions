package Chapter_03;
import java.util.Scanner;

public class Question3_13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), " + 
        "2-married separately, 3-head of household) Enter the filing status: ");
        int status = input.nextInt();
        System.out.print("Enter taxable income:");
        double income = input.nextDouble();

        double tax = 0;

        // Not done
    }
}
