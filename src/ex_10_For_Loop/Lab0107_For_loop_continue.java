package ex_10_For_Loop;

import java.util.Scanner;

public class Lab0107_For_loop_continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i =0;i<num; i++)
        {
            if(i==5)
            {
                continue; // the moment i become 5 it will skip the i value and continue
            }
            System.out.println(i);
        }

    }
}
