package ex_08_If_Condition;

public class Lab0078_If_Else_InterviewQ2_AlternativeWay {
    public static void main(String[] args) {
        for(int i =1;i<=100;i++)
        {
            String result = "";
            if (i % 3 ==0)
            {
                System.out.println("Fizz");
            } else if ( i % 5 ==0) {
                System.out.println("Buzz");
            }
            else {
                System.out.println(result.isEmpty()? i : result);
            }
        }
    }
}
