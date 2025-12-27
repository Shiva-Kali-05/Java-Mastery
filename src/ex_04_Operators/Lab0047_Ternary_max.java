package ex_04_Operators;

public class Lab0047_Ternary_max {
    public static void main(String[] args) {
        int n1 =2;
        int n2 =9;
        int n3 =11;
        String result = (n1>n2 && n1>n3) ? "n1 is greater" : (n2>n1 && n2>n3) ? "n2 is greater" :"N3 is greater";
        System.out.println(result);
    }



}
