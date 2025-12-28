package ex_07_IncrementDecrement_Operators;

public class Lab0067_Decrement_Operator {
    public static void main(String[] args) {
        int a =10;
        int result = --a;
        System.out.println(result);

        int result1 = a--;
        System.out.println(result1);
        System.out.println(a);

        System.out.println(a-- - --a);

    }
}
