package ex_08_If_Condition;

import java.util.Scanner;

public class Lab0075_If_ElseIf_Else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your age");
        int age = sc.nextInt();
        //int age = 3;
        if(age>34)
        {
            System.out.println("Your age is greater than 34");
        } else if (age<34) {
            System.out.println("Your age is less than 34");
        }
        else if (age ==34){
            System.out.println("Your age is 34");
        }
        else {
            System.out.println("Invalid");
        }
        sc.close();
    }

}
