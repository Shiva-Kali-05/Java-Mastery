package ex_08_If_Condition;

public class Lab0071_If_Statement_CommandLine {
    public static void main(String[] args) {
        System.out.println("Enter the age via command line option \n ");
        int age = Integer.parseInt(args[0]);
        if (age>18)
        {
            System.out.println("You are eligible to vote");
        }
        else {
            System.out.println("You are not eligible for vote");
        }
    }
}
