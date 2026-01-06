package ex_09_Switch_Statement;

public class Lab0090_Switch_JDKabove13 {
    public static void main(String[] args) {
        //if you have a jdk more than 13 then no need to add break in switch, it is not required only use arrow
        int a = 001;
        switch (a)
        {
            case 01 -> System.out.println("0001");
            case 02 -> System.out.println("0002");
            default -> System.out.println("Default value");
        }

    }
}
