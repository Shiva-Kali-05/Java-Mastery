package ex_09_Switch_Statement;

public class Lab0091_Switch_JDKabove13 {
    public static void main(String[] args) {
        // in JDK above 13, we can add multiple conditions as well
        int a = 005;
        switch (a)
        {
            case 001,002,003 -> System.out.println("Hello");
            case 004,005,006 -> System.out.println("HI");
            default -> System.out.println("good morning");
        }
    }
}
