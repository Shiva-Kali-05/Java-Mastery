package ex_05_TypeCasting_Basics;

public class Lab0049_TypeCasting_1 {
    public static void main(String[] args) {
        byte b = 10;
        int i = b; //implicit widening, it is internally done
        int i2 = (int)b;//explicit widening
        float f = b;
        //boolean b1 = b; this is not possible

        System.out.println(i);



    }
}
