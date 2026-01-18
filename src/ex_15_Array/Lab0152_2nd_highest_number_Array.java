package ex_15_Array;

import java.util.Arrays;

public class Lab0152_2nd_highest_number_Array {
    public static void main(String[] args) {
        int marks[] = {54,85,695,8,425,42};
        Arrays.sort(marks);
        System.out.println(marks[marks.length-2]);
        //Without using functions

    }
}
