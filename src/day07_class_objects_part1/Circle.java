package day07_class_objects_part1;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        double radius = input.nextDouble();

        System.out.println("The area od the Circle is: " + area(radius));
        System.out.println("The perimeter of the circle is: " + perimeter(radius));

        input.close();
    }

    public static double area(double radius){
        return radius * radius * 3.14;
    }
    public static double perimeter(double radius){
        return 2 * radius * 3.14;
    }

}
/*
6. Create a class named Circle and write a program
that asks the user to enter the radius of the Circle and calculate
the area and perimeter of the Circle.

        Example:
             Enter the radius:
             Input: 5

        Output:
             The area of the Circle is 78.5
             The perimeter of the Circle is 31.4
 */