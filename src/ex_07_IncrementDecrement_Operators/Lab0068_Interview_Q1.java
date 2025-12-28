package ex_07_IncrementDecrement_Operators;

public class Lab0068_Interview_Q1 {
    public static void main(String[] args) {
        int a = 10;
        a = a++ +a++ + a++;
        System.out.println(a);
        //a = 10
        //a++ = 10+1=11
        //a++ = 11+1 = 12
        //a++ = 12+1 = 13
       // 11+12+13 =36
        // this is a post increment so value will print first
    }
}
