package ex_08_If_Condition;

import java.util.Scanner;

public class Lab0076_If_Else_InterviewQ {
    public static void main(String[] args) {
        //Write a program that classifies a triangle based on its side lengths.
        // Given three input values representing the lengths of the sides,
        // determine if the triangle is equilateral (all sides are equal),
        // isosceles (exactly two sides are equal), or scalene (no sides are equal).
        // Use an if-else statement to classify the triangle.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Side");
        int a = sc.nextInt();
        System.out.println("Enter Second side");
        int b = sc.nextInt();
        System.out.println("Enter third side");
        int c = sc.nextInt();
        if (a==b && b==c)
        {
            System.out.println("equilateral");
        } else if (a==b || b==c || a==c) {
            System.out.println("isosceles");

        }
        else{
            System.out.println("scalene");
        }

    }
}
