package ex_05_TypeCasting_Basics;

public class Lab0051_TypeCasting_3 {
    public static void main(String[] args) {
        long phone = 9577884759l;
        //short s = phone;  //Narrowing implicit is not allowed
        //if you want to use at anyhow then use as explicit
        short s = (short)phone;
        System.out.println(s);

    }
}
