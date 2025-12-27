package ex_05_TypeCasting_Basics;

public class Lab0050_TypeCasting_2 {
    public static void main(String[] args) {
        byte b = 10;
        int a =b;
        int a1 = (int)b;  //previous scenario

        int p = 300;
        byte by = (byte)p; //implicit narrowing
        System.out.println(by);
// this is possible but the value does not print as 300. The size of int is 32 bit and 8 bits for Byte
// only 8 bits will pick and calculate the value. i.e. 44




    }
}
