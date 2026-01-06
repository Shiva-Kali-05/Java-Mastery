package ex_09_Switch_Statement;

public class Lab0086_Switch_nterview {
    public static void main(String[] args) {
        //Tell me is this a valid syntax
        char c = 'A';
        switch (c)
        {
            case 65:
                System.out.println("Match with ASCII");
                break;
            default:
                System.out.println("No match");
        }
    }
}
