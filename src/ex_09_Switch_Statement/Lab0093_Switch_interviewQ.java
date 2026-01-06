package ex_09_Switch_Statement;

public class Lab0093_Switch_interviewQ {
    public static void main(String[] args) {
        //what will be the output?
        //ans - first it will print default value and then it will print 65 as we have not mentioned break.

        char code ='C';
        switch (code)
        {
            default:
                System.out.println("Helloooo");
            case 'A':
                System.out.println("65");
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
