package ex_15_Array;

public class Lab0151_Sum_of_Array {
    public static void main(String[] args) {
        int marks[]={5,5,5,5};
        int sum=0 ;
        for(int i =0;i<marks.length;i++)
        {
            sum = sum + marks[i];
        }
        System.out.println(sum);
    }
}
