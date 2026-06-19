package ex_29_Generics;

public class Lab0203_ActualGenerics {
    public static void main(String[] args) {
        temp_sum("Nihal","123");
        temp_sum('A',"Generics");
        temp_sum(12.55,4568);
        

    }
//    static void temp_sum(Integer a, Integer b)
//    {
//        System.out.println(a);
//        System.out.println(b);
//    }

    //we can write the above static method in diff way like below

    static <T> T temp_sum(T a, T b)
    {
        System.out.println(a);
        System.out.println(b);
        return null;
    }
// What is T here, T basically means any data type, you can pass anything.


}
