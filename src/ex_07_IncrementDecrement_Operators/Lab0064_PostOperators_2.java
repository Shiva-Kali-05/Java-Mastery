package ex_07_IncrementDecrement_Operators;

public class Lab0064_PostOperators_2 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++ + a);
        // a++ is post increment so a value is now 11
        // + is concatination operator
        // a - value of a is 10
        // 11 +10 = 21
    }
}
