package ex_02_Java_Basics_ClassNames;

public class Lab0017_Variable_InterviewQ6 {
    public static void main(String[] args) {


        byte b = 10;
        short s = 10;
        int i = 10;
        char c = 'N';//char always in single quote
        //char c1 = S;//without single quote is also ok,char is also an integer
        char t1 = '&';
        char d = '_';
        // int phone = 973017721548; size issue
        long phone = 973017721548l;//for long we should add l at the end to the value
        long phone1 = 222222212L;//Capital L is also ok
        float f = 3.14f; //for float also we need to add f in the end
        //Why L is added in the value for both the data tax?
        //This is rule and it is mandatory for both

        String name = "Nihal";//Non premitive data type
        //Nihal -- > N,i,h,a,l -- > String is bunch of characters
        System.out.println(name);

    }

}
