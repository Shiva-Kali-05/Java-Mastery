package ex_15_Array;

import java.util.Scanner;

public class Lab0149_Array_UserInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int result = sc.nextInt();
        String marks [] = new String [result];// user input will store in result.
        for(int i =0;i<marks.length;i++)
        {
            System.out.println("Enter marks");
            marks [i]=sc.next();

        }
        System.out.println("====");
        for(int i =0; i<marks.length;i++)
        {
            System.out.println("==========");
        }
    }
}
