package ex_29_Generics;

public class Lab0202_Generics {
    public static void main(String[] args) {
        //Generic means, is simple words anyone can use it
        // Generics allow you to use classes, interfaces, and methods that work with any data type
        temmp_sum(12,15);
        temmp_sum(25,45);
        temmp_sum("Nihal","Shiva");
    }
    static void temmp_sum(Integer a, Integer b)
    {
        System.out.println(a);
        System.out.println(b);
    }

    static void temmp_sum(String a, String  b)// method overloading
    {
        System.out.println(a);
        System.out.println(b);
    }
}
// here if we want to store diff value then will have to create new method with diff data type
// this is actually a problem, so we can write the code using generic to overcome this issue in next Lab0203