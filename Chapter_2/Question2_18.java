package Chapter_2;

/*
 * (Print a table) Write a program that displays the following table. Cast 
    floating-point numbers into integers.
    a b pow(a, b)
    1 2 1
    2 3 8
    3 4 81
    4 5 1024
    5 6 15625
 */

public class Question2_18 {
    public static void main(String[] args) {
        System.out.println("a\tb\tpow(a, b)");
        System.out.println("1\t2\t" + (int) Math.pow(1, 2)); // explicitly casting the type double gotten from Math.pow()
        System.out.println("2\t3\t" + (int) Math.pow(2, 3));
        System.out.println("3\t4\t" + (int) Math.pow(3, 4));
        System.out.println("4\t5\t" + (int) Math.pow(4, 5));
        System.out.println("5\t6\t" + (int) Math.pow(5, 6));        
    }
}
