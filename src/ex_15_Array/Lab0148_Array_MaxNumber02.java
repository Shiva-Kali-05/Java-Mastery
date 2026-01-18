package ex_15_Array;

public class Lab0148_Array_MaxNumber02 {
    public static void main(String[] args) {
        int array[]={45,87,586,25,34};
        //easiest way to find max number is using sort
//        Arrays.sort(array);
//        System.out.println(array[array.length-1]);

        int max=array[0];
        for(int i =1;i<array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        System.out.println(max);
    }
}
