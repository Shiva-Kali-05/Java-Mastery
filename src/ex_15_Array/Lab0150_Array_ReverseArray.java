package ex_15_Array;

public class Lab0150_Array_ReverseArray {
    public static void main(String[] args) {
        String subjects[]={"Marathi","English","Hindi","Maths"};
        //System.out.println(subjects[0]);
        //Reverse print
        for(int i = subjects.length-1;i>=0;i--)
        {
            System.out.println(subjects[i]);
        }

    }
}

