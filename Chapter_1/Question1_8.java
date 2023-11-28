package Chapter_1;

/*
 * (Area and perimeter of a circle) Write a program that displays the area and 
 * perimeter of a circle that has a radius of 5.5 using the following formulas:
 * perimeter = 2 * radius * p
 * area = radius * radius * p
 */

public class Question1_8 {
    public static void main(String[] args) {
        System.out.println("Radius given is 5.5, area = ?, perimeter = ?");
        double radius = 5.5;
        double per = 2 * radius * Math.PI;
        double area = radius * radius * Math.PI;
        System.out.println("Perimeter is " + per);
        System.out.println("Area is " + area);
    }
}
