package ex_02_Java_Basics_ClassNames;

public class Lab0013_Variable_InterviewQ2 {
    public static void main(String[] args) {
        // want to store age of person, which datatype should i use?
        int age = 122; //we know that the max age of person is 122 so no need to use int, it will waste the memory
        byte age1 =122;
        // byte age2=128; // cannot store 128, overflow size, -127 to 128 (byte)
        short age3 = 128; //this will be ok, it's size is bigger than byte
        System.out.println(age);
        System.out.println(age1);
        System.out.println(age3);
    }
}
