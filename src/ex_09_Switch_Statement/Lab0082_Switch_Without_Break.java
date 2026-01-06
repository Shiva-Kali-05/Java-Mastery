package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab0082_Switch_Without_Break {
    public static void main(String[] args) {
        //Interview Q - What is the output of the below code if user enters 1 and 4.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7");
        int day = sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
            case 3:
                System.out.println("Wed");
            case 4:
                System.out.println("Thur");
            case 5:
                System.out.println("Fri");
            case 6:
                System.out.println("sat");
            case 7:
                System.out.println("sun");
            default:
                System.out.println("invalid");
        }
    }
}