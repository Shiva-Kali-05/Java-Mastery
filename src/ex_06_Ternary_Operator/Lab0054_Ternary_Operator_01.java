package ex_06_Ternary_Operator;

public class Lab0054_Ternary_Operator_01 {
    public static void main(String[] args) {
        //Syntax
        //result = condition ? "expression1" : "expression2";
        //It is just like a if else statement
        // condition is a boolean expression
        int age = 16;
        String canNihalGoToGoa = age>18 ? "NihalWillGo" : "NihalWillNotGo";
        System.out.println(canNihalGoToGoa);
    }
}
