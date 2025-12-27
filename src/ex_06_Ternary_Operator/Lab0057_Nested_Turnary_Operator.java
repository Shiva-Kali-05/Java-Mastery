package ex_06_Ternary_Operator;

public class Lab0057_Nested_Turnary_Operator {
    public static void main(String[] args) {
        //Syntax
        // result = condition1 ? expression1 : (Condition 2 ? expression1 : expression2);
        //It is same like as nested if else statement
        int age = 45;
        String result = age>18 ? (age>27 ? "You can drink": "You can't drink") : "You can't go to goa";
        System.out.println(result);
    }
}
