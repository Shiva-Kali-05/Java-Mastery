package ex_09_Switch_Statement;

public class Lab0092_Switch_interviewQ {
    public static void main(String[] args) {
        //What is the output of this program
        int a = -11;
        switch (-1) //here -1 will match directly to -1 value i.e. 10 in this case.
        {
            default -> System.out.println("Default");
            case -1 -> System.out.println("10");
            case 9 -> System.out.println("9");
        }
    }
}
