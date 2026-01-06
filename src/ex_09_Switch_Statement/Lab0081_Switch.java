package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab0081_Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 1 to 7.
        // And if user enters 1 to 7, 1- Mon,
        // you will tell which day it is


        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter any number from 1 to 7 so that i show you the day");
        if (sc.hasNextInt()) {
            int day = sc.nextInt();
            switch (day) {
                case 1:
                    System.out.println("Mon");
                    break;
                case 2:
                    System.out.println("Tue");
                    break;
                case 3:
                    System.out.println("Wed");
                    break;
                case 4:
                    System.out.println("Thur");
                    break;
                case 5:
                    System.out.println("Fri");
                    break;
                case 6:
                    System.out.println("sat");
                    break;
                case 7:
                    System.out.println("sun");
                    break;
                default:
                    System.out.println("invalid");
                    break;
            }

        } else {
            System.out.println("Input should be in integer only");
        }
        System.out.println("End of Program");
    }
}
