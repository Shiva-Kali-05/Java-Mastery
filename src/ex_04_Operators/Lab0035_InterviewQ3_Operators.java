package ex_04_Operators;

public class Lab0035_InterviewQ3_Operators {
    public static void main(String[] args) {
        String first_name ="Shiva";
        String last_name="Kale";
        int a =10;
        int b = 10;
        //Revers
        System.out.println(a+b+first_name+last_name);
        //JVM will check first time it can see mathematical ope and then string ope
        // so jvm will treat first + as integer and for string it will do concat

    }
}
