package ex_06_Ternary_Operator;

public class Lab0061_CLI_Inputs_Java {
    //Q - User will give an input as age
    // Need to check user is minor, adult or senior citizen ?
    //User will give inputs from command line

    public static void main(String[] args) {
    String age_input_string = args[0]; // args 0 is the first index but the user will provide age in number
        // we need to convert string into int by following
        System.out.println(age_input_string instanceof String);
        int age = Integer.parseInt(age_input_string);
        //Using parseInt we can convert and not possible by type casting
        System.out.println(age);

        String result = (age < 18) ? "Minor" :(age <=60)? "Adult" : "Senior Citizen";
        System.out.println(result);


    }
}
