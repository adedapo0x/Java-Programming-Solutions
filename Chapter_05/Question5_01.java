package Chapter_05;
import java.util.Scanner;

public class Question5_01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer, the input ends if it is zero: ");
        int positiveCount = 0, negativeCount = 0;
        double total = 0, average = 0;
        int num = input.nextInt();
        if (num == 0){
            System.out.println("No numbers are entered except zero");
            System.exit(1);
        }
        while (num != 0) {
            if(num > 0) 
                positiveCount++;
            else if (num < 0)
                negativeCount++;          
            total += num;
            num = input.nextInt();
        } 

        average = total / (positiveCount + negativeCount);
        System.out.println("Number of positives is " + positiveCount);
        System.out.println("Number of negatives is " + negativeCount);
        System.out.println("The total is " + total);
        System.out.println("Average is " + average);
        
        input.close();
    }
}
