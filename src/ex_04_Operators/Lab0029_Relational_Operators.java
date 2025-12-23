package ex_04_Operators;

public class Lab0029_Relational_Operators {
    public static void main(String[] args) {
        int a =10;
        int b =15;
        int c=24;
        if (a>b && a>c)
        {
            System.out.println("a is greater");
        } else if (b>c && b>a) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }

            }
}
