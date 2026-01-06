package ex_09_Switch_Statement;

import java.util.Scanner;

public class Lab0083_Switch {
    public static void main(String[] args) {
        //Q - what will be the output if user entered 3? ans - nothing will show and no error as well

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7");
        int day = sc.nextInt();
        switch (day)
        {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }

    }
}
