package ex_04_Operators;

public class Lab0034_InterviewQ2_Operators {
    public static void main(String[] args) {
        String first_name ="Shiva";
        String last_name="Kale";
        int a =10;
        int b = 10;
        System.out.println(first_name+last_name+a+b); //concat and also integer
        //in this case error will not come
        //JVM always goes from left to right ie from first_name
        // it will check the first operator is + which is for string so it will do concat
        // The moment it see a+b which is int, but initially i did concat so will follow the same
        // it will print like ShivaKale1010 it will not add two intgers
        // if the first time is concat then it will use same for others
        //What if we apply bracket, it will add two integer number
        System.out.println(first_name+last_name + (a+b));

    }
}
