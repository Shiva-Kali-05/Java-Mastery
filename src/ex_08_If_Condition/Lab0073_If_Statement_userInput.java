package ex_08_If_Condition;

import java.util.Scanner;

public class Lab0073_If_Statement_userInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        if(age<=18)
        {
            System.out.println("You are too young!!");
        }
        else {
            System.out.println("You are eligible!!");
        }
    }
}
